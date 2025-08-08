package Multithreading;

import java.util.Arrays;
	
	class Sort extends Thread{
		int[] arr;
		
		public Sort(int[] arr) {
			this.arr=arr;
		}
		public void run() {
			Arrays.sort(arr);
		}
	}

	public class ThreadSort{
		public static void main(String[] args) throws InterruptedException {
			int[] numbers= {5,9,3,1,8,7,4,2};
			Sort thread=new Sort(numbers);
			thread.start();
			
			thread.join();
			
			System.out.println(Arrays.toString(numbers));
		}
		
	}
	

