package IO.CharStreams;

import java.io.*;

public class CharArrayWriteRead {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\text2_Char.rtf")); 
        char[] chars = "HelloCharArray!".toCharArray();
        bw.write(chars);            
        bw.newLine();                
        bw.write(chars, 5, 9);       
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("D:\\text2_Char.rtf")); 
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
