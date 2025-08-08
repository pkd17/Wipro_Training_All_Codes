package CollectionFrameworkJava;

import java.util.Stack;

public class StackEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Stack<Integer> st=new Stack<>();
      
      System.out.println(st.empty());
      st.add(10);
      st.add(50);
      st.add(40);
      st.add(70);
      st.add(5);
      st.add(110);
      System.out.println(st);
      
      st.peek();
      System.out.println(st);
      
      st.pop();
      System.out.println(st);
      
      st.push(90);
      System.out.println(st);
      
      System.out.println(st.search(50));
      
      st.remove(3);
      
      
      System.out.println(st);
      
      System.out.println(st.capacity());
      
      System.out.println(st.indexOf(70));
      
      st.insertElementAt(100, 2);
      System.out.println(st);
	}

}
