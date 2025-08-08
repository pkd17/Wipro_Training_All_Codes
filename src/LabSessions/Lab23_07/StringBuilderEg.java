package Lab23_07;

public class StringBuilderEg {
	public static void main(String[] args) {
        // Creating a StringBuilder
		
		//Mutable in nature
		
		//String Builder Methods
        StringBuilder sb = new StringBuilder("hello");
        System.out.println("Original: " + sb);

        // append
        sb.append(" world");
        System.out.println(sb);

        // insert
        sb.insert(6, "beautiful ");
        System.out.println(sb);

        // delete
        sb.delete(6, 16);  // removes "beautiful "
        System.out.println(sb);

        // reverse
        sb.reverse();
        System.out.println(sb);
        sb.reverse();

        // replace
        sb.replace(6, 11, "Java");
        System.out.println(sb);

        // substring
        String sub = sb.substring(6, 10);
        System.out.println(sub);

        // charAt
        char ch = sb.charAt(1);
        System.out.println(ch);

        // indexOf
        int index = sb.indexOf("Java");
        System.out.println(index);

        // length
        int len = sb.length();
        System.out.println(len);
        

        // isEmpty 
        boolean isEmpty = sb.length() == 0;
        System.out.println(isEmpty);

        StringBuilder repeated = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            repeated.append(sb);
        }
        System.out.println(repeated);
	}
}
