package examscores.scores;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;

/**
 * Main
 * I got as far as to clean the data up. Everything else is from Chuk.
 */
public class MainReader {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String srcFile = args[0];
        Reader reader = new FileReader(srcFile);
        BufferedReader br = new BufferedReader(reader);

        // Creating new list to store the records
        List<String[]> records = new LinkedList<>();

        // Iterate through the file to store all records into the new list
        String row;
        while ((row = br.readLine()) != null) {
            String[] data = row.split(",");
            for (String el : data) {
                el.replaceAll("\"", "");
            }
            System.out.print(data[1]);
        }
        reader.close();
    }
}