package chapter10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamApi {

    public void error(String filename) throws Exception {
        List<String> errors = new ArrayList<>();
        int errorCount = 0;
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line = br.readLine();

        while (errorCount < 40 && line != null) {
            if (line.startsWith("ERROR")) {
                errors.add(line);
                errorCount++;
            }
            line = br.readLine();
        }
    }

    public void errors(String filename) throws IOException {
        List<String> errors = Files.lines(Paths.get(filename))
                .filter(line -> line.startsWith("ERROR"))
                .limit(40)
                .collect(toList());
    }
}
