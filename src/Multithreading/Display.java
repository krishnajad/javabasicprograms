//This Synchronization example

package Multithreading;

public class  Display {
	public synchronized void  show(String name) {
		for(int i=0;i<5;i++) {
			System.out.print("Good Morning : ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
			
		}
	}

}
