package chapter03.step4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Print {

    public static String processFile(BufferedReaderProcessor p) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            return p.process(br);
        }
    }

    public static void main(String[] args) throws IOException {
        String oneLine = processFile(br -> br.readLine());

        String twoLine = processFile(br -> br.readLine() + br.readLine());

    }
}
