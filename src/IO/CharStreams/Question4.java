package IO.CharStreams;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Question4 {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("D:/Serialization65786.rtf"))) {

            System.out.println("Reading students from file:");
            while (true) {
                try {
                    Student s = (Student) in.readObject();
                    System.out.println(s);
                } catch (EOFException eof) {
                    break; 
                }
            }

        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}