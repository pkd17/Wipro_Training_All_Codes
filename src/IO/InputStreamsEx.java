package IO;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamsEx {
    public static void main(String[] args) {
        try {
            // Use double backslashes \\ or single forward slashes /
            FileInputStream input = new FileInputStream("D:\\JAvaFile.rtf");

            System.out.println("Data in the file:");

            // Read and print each byte from the file
            int i = input.read();
            while (i != -1) {
                System.out.print((char) i);
                i = input.read();
            }

            input.close();
        } catch (Exception e) {
            System.out.println(e);
        } 
    }
}

