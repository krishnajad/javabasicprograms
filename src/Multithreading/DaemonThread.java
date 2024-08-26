package Multithreading;

public class DaemonThread extends Thread {
	@Override
	public void run(){
		if(Thread.currentThread().isDaemon()) {
			System.out.println("This is an daemon Thread");
		}
		else 
		{
			System.out.println("This is an child Thread");
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Thread");// if we comment this line above run method will not eicute because below thread is demon thread wich provide only service to main thread
		DaemonThread tt=new DaemonThread();
		tt.setDaemon(true);
		tt.start();
		

	}

}
