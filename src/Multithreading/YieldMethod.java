package Multithreading;

public class YieldMethod extends Thread{
	public void run() {
		for(int i=0;i<6;i++) {
			System.out.println(Thread.currentThread().getName()+-+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YieldMethod t=new YieldMethod();
		t.start();
		Thread.yield();  //Thread shedular decide to accept it or ignore it,this method gives hint to Thread scedular that i am reddy to stop
		for(int i=0;i<6;i++) {
			System.out.println(Thread.currentThread().getName()+-+i);
		}
		
		

	}

}
