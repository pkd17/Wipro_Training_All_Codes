package CoreJava;

public class Operators {
	public static void main(String[] args) {
		int i=10;
		i++;
		System.out.println(i);
		i--;
		System.out.println(i);
		++i;
		System.out.println(i);
		--i;
		System.out.println(i);
		
		//Arithmetic Operators
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		int d=a-b;
		System.out.println(d);
		int e=a*b;
		System.out.println(e);
		int f=a/b;
		System.out.println(f);
		
		//shift Operators
		//left shift <<
		System.out.println(10<<2); // 10*2^2=40
		System.out.println(10<<3); //10*2^3=80		
			
		//right shift >>
		System.out.println(10>>2); //10/2^2=2
		System.out.println(20>>2); //20/2^2=5
		
		
		//Relational Operator > < <= >= == !=
		int x=10;
		int y=20;
		
		System.out.println(x==y);
		System.out.println(x!=y);
		System.out.println(x>y);
		System.out.println(x<y);
		System.out.println(x>=y);
		System.out.println(x<=y);
		
		//BitWise Operators
		// &, |, ^, ~, <<, >>
		int p=5;//0101
		int q=3;//0011
		
		int r=p&q; //0001
		
		System.out.println(r);
		
		int e1=8;//1000
		int f1=0;//0000
		
		int g1=e1 & f1;
		System.out.println(g1);
		
		int s=e1|f1;
		System.out.println(s);
		
		System.out.println(p|r);
		
		
		//Logical Operators 
		// &&, ||, !
		
		//&&- Returns true if both operands are true, otherwise false
		int u=10;
		int v=20;
		if(u<v && v>15) {
			System.out.println("both condition are true");
		}
		//Logical or ||
		
		int age=25;
		if(age<18 || age>21) {
			System.out.println("cond true");
		}
		
		//! NOT 
		
		boolean isRaining= false;
		if(!isRaining) {
			System.out.println("You can go out");
		}
		
		//Assignment Operators
		// =, +=, -=
		
		int k=10;
		int l=20;
		
		k+=4; //k=k+4	
		System.out.println(k);
		
		l-=4; //l=l-4
		System.out.println(l);
		
		//Ternary Operator
		//short hand for if-else
		//condition ? expression if_true : expression if_false
		
		int w1 = 10, w2=20;
		int max =(w1>w2)? w1:w2;
		
		System.out.println(max);
		
		int a1,a2;
		a1=10;
		a2=a1++;
		
		System.out.println(a1);
		System.out.println(a2);
		
		
  	}

}
