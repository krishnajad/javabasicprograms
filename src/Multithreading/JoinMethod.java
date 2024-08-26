package Multithreading;

public class JoinMethod extends Thread{
	public void run() {
		try {
		for(int i=0;i<=5;i++) {
			System.out.println("child Thread - "+i);
			Thread.sleep(1000);
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinMethod j=new JoinMethod();
		j.start();
		
		try {
			j.join();//main thread wit until child class exicution complited 
			for(int i=5;i<=10;i++) {
				System.out.println("main Thread - "+i);
				//Thread.sleep(1000);
			}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		
		

	}

}
