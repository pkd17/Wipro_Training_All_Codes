package Multithreading;

public class NewThreadEg extends Thread {
	public void run() {
		System.out.println("Thread is running");
	}
	class Test{

	public static void main(String[] args) {
		NewThreadEg t=new NewThreadEg();
		t.start();

	}

}
}