package IO.CharStreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderEx {

    public static void main(String[] args) throws IOException {
        // Writing to the file using FileWriter
        FileWriter fw = new FileWriter("D:\\text6.rtf");
        fw.write("I am the file writer");
        fw.close();

        // Reading from the file using FileReader
        FileReader fr = new FileReader("D:\\text6.rtf");
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }
        fr.close();
    }
}

