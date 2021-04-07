package ObligatoriskeOpgaverInheritance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class exercise3 {
    public static void main(String[] args) throws IOException {
        String lineBreaks;
        int wordCounter = 0;

        FileReader file = new FileReader("resources/students.csv");
        BufferedReader br = new BufferedReader(file);

        while ((lineBreaks = br.readLine()) != null) {
            String words[] = lineBreaks.split(" ");
            wordCounter = wordCounter + words.length;

        }
        System.out.println(wordCounter);
    }
}
