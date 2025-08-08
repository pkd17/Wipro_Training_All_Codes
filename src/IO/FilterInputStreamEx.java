package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;

public class FilterInputStreamEx {

	public static void main(String[] args) {
		// filter streams folder data as they read and write data in the input
		//filter it and pass on to the underlying streams
		
		FileInputStream fis=null;
		FilterInputStream filterinput=null;
		
		try {
			fis=new FileInputStream("D:\\\\JAvaFile.rtf");
			filterinput = new BufferedInputStream(fis);
			
			
			int data;
			while((data=filterinput.read()) !=-1) {
				System.out.println((char)data);
			}
			fis.close();
		}catch(Exception e){
			System.out.println(e);
		}
		

	}

}
