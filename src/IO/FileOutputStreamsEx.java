package IO;

import java.io.FileOutputStream;

public class FileOutputStreamsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String data ="I am attending the java training class";
       
       try {
    	   FileOutputStream output=new FileOutputStream("D:\\JAvaFile.rtf");
    	   byte[] array=data.getBytes();
    	   
    	   output.write(array);
    	   output.close();
    	   
       }
       catch(Exception e) {
    	   System.out.println(e);
       }
	}

}
