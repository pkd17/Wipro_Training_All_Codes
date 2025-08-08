package Lab23_07;

public class StringExp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Core Java";
		String str2="Salenium";
		
		System.out.println(str1.equals(str2));//false
		System.out.println(str1.equalsIgnoreCase(str2));//false
		
		//Concatenation
		
		System.out.println(str1.concat(str2));//Core JavaSalenium
		
		//Contains
		
		System.out.println(str1.contains("j"));//false
		
		//Substring
		
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(1,3));
		
		//replace
		System.out.println(str1.replace("o","g"));
		System.out.println(str1.replaceAll(str1, "Python"));
		
		//isEmpty
		
		System.out.println(str1.isEmpty());//false
		
		//ends With
		
		System.out.println(str1.endsWith("e"));//false
		
		//join
		String str3=String.join("-","course","Core Java");
		System.out.println(str3);
		
		
		
		//Compare to lexo graphical comparison
		String text="java is a programming language";
		String[] result= text.split(" ");
		
		for(String str: result) {
			System.out.println(str+",");
	}
	}
}
