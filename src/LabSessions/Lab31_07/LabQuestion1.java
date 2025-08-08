package Lab31_07;

public class LabQuestion1 {

	public static void main(String[] args) {
		
       String input="a2b3c4";
       StringBuilder s=new StringBuilder();
       
       for(int i=0; i<input.length();i=i+2) {
    	   char ch=input.charAt(i);
    	   
    	   int count=input.charAt(i+1)-'0';
    	   
    	   for(int j=0;j<count;j++) {
    		   s.append(ch);
    	   }
       }
       System.out.println(s.toString());
       
	}

}
