package chapter03.step1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Basic {
    public static String processFile() throws IOException {
        try (BufferedReader br =
                     new BufferedReader(new FileReader("data.txt"))) {
            return br.readLine();
        }
    }

    public static void print() {
//        String result = processFile(br -> br.readLine() + br.readLine());
    }
}
