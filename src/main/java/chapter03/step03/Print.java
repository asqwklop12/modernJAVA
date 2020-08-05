package chapter03.step03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Print {

    public String processFile(BufferedReaderProcessor p) throws IOException {
        try (BufferedReader br =
                     new BufferedReader(new FileReader("data.txt"))) {
            return p.process(br);
        }
    }
}
