package IO;

import java.io.ByteArrayOutputStream;

public class ByteArrayInputStream {

    public static void main(String[] args) {

       String data="This is aline of text inside the string";

        try {
            // Correctly declare and initialize the input stream
            ByteArrayOutputStreams input = new ByteArrayOutputStreams();
            byte[] array=data.getBytes();
            
            out.write(array);
            String streamData=out.toString();
            System.out.println("Output stream"+ streamData);
            
            out.close();


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
