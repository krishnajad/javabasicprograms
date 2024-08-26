package Multithreading;

public class InterruptMethod extends Thread{
	public void run() {
		System.out.println(Thread.interrupted());// it wil change status of interrupt() method from true to false
		System.out.println(Thread.interrupted());
		System.out.println(Thread.currentThread().isInterrupted());
		for(int i=1;i<=5;i++) {
			System.out.println("Thread 0 - "+i);
			try {
				Thread.sleep(1000);//if these method is not present then program will work properly
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		InterruptMethod t= new InterruptMethod();
		t.start();
		t.interrupt();//this method only works with sleep() and wait() method
		// TODO Auto-generated method stub

	}

}
