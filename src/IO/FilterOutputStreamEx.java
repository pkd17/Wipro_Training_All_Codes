package IO;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStreamEx {

    public static void main(String[] args) throws IOException {
        // Filter streams process data as they read/write
        // and pass it on to the underlying streams

        FileOutputStream fos = null;
        FilterOutputStream filterOutput = null;

        try {
            fos = new FileOutputStream("D:/File3.rtf");
            filterOutput = new BufferedOutputStream(fos);

            String text = "Hii! who are you??";
            filterOutput.write(text.getBytes());
       
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            filterOutput.close();
            fos.close();
        }
    }
}
