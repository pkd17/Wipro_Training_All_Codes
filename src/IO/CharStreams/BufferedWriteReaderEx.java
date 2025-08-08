package IO.CharStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteReaderEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       //reading and writing line by line buffered reader and writer is used
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("D:/text10.rtf"));
		bw.write("I am the Buffered file writer");
		bw.close();
		
		BufferedReader br=new BufferedReader(new FileReader("D:/text10.rtf"));
		String line;
		while((line= br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
	}

}
