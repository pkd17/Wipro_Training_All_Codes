package IO;

import java.io.ByteArrayOutputStream;

public class ByteOutputArrayStreamEg {
    public static void main(String[] args) {

        String data = "This is a line of text inside the string";

        try {
            // Correctly declare and initialize the output stream
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            byte[] array = data.getBytes();

            output.write(array);  // write byte array to output stream
            String streamData = output.toString();  // convert stream data to string
            System.out.println("Output stream: " + streamData);

            output.close();  // close the stream
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
