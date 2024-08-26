package Multithreading;

public class MultiPractice2 extends Thread{
	public void run() {
		for (int i = 21; i < 40; i++) {
			try {
			Thread.sleep(100);
			System.out.println(i);}
			catch(InterruptedException e){
				System.out.println("e");
				
			}
			
		}

	}
}
	
