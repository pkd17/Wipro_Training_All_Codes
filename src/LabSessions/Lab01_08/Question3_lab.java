package Lab01_08;

import java.io.File;
import java.io.FileInputStream;

public class Question3_lab { 
    public static void main(String[] args) {
        File file = new File("D:/text112.rtf");  

        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] data = new byte[(int) file.length()]; 
            fis.read(data); 

            
            String content = new String(data);
            System.out.println("File contents:\n" + content);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
