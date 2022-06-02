package myapp.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// java IOMain <src> <dest>

public class IOMain {

    public static void main(String[] args) {

        // Get the filenames from Command Line Input
        String srcFile = args[0];
        String dstFile = args[1];

        // 1K byte buffer
        byte[] buffer = new byte[1024];
        int size = 0;
        try {
            InputStream inputStream = new FileInputStream(srcFile);
            System.out.printf("%s file is opened \n", srcFile);

            OutputStream os = new FileOutputStream(dstFile);

            while (size >= 0) {
                size = inputStream.read(buffer);
                System.out.printf("read: %d \n", size);

                if (size > 0) {
                    os.write(buffer, 0, size);
                }
            }
            inputStream.close();
            // Always remember to flush the output streamdata before closing it
            os.flush();
            os.close();            
        } catch (FileNotFoundException error) {
            System.err.println(error.getMessage());
        } catch (IOException error) {
            System.err.println(error.getMessage());
        }
    }
}
