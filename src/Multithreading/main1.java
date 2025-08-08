package Multithreading;

public class main1 {
	public static void main(String[] args) {
        Runnable task = new Runnable() {
            public void run() {
                System.out.println("Hello! World");
            }
        };

        Thread thread = new Thread(task); 
        thread.start(); 
    }

}
