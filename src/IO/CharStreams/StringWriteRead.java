package IO.CharStreams;

import java.io.*;

public class StringWriteRead {
    public static void main(String[] args) throws IOException {
        // Writing to file
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Text2_String.rtf"));
        bw.write("This is a sample String.");
        bw.close();

        // Reading from file
        BufferedReader br = new BufferedReader(new FileReader("D:\\Text2_String.rtf"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
