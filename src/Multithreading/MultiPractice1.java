package Multithreading;

public class MultiPractice1 extends Thread{
	public void run() {
		for(int i=0;i<20;i++) {
			
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		MultiPractice1 t1=new MultiPractice1();
		MultiPractice2 t2=new MultiPractice2();
		t1.start();
		t2.start();
		Thread.currentThread().setName("krishna");// setting name of thread
		System.out.println(Thread.currentThread().getName());// getting name of Thread
		

	}

}
