package myapp.core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderMain {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String srcFile = args[0];
        Reader reader = new FileReader(srcFile);
        BufferedReader br = new BufferedReader(reader);

        String line = "";
        int lineNumber = 0;

        while (line != null) {
            line = br.readLine().toUpperCase();
            lineNumber++;
            System.out.printf("%d: %s \n", lineNumber, line);
        }
        reader.close();
    }
}
