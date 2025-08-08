package IO.CharStreams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEg {

	public static void main(String[] args) throws IOException {
		// serialization is a process of converting objects into bytes
		//write Object()
		//Read Object()
		try {
		Student s1= new Student(211,"john");
		
		FileOutputStream fout=new FileOutputStream("D:/Serialization65786.rtf");
		
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(s1);
		out.flush();
		
		out.close();
		System.out.println("Object is serialazed");
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
