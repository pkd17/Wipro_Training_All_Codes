package CoreJava;

public class PrimeNumber {
	
	public static int checkPrime(int n) {
		if(n<=1) {
			return -1;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return -1;
			}
		}
		return n;
	}
	public static void main(String[] args) {
		int n=15;
		
		int res=checkPrime(n);
		if(res!=-1) {
			System.out.println("is prime number"+ res);
		}
		else {
			System.out.println("is not a prime number"+ res);
			
		}
	}

}
