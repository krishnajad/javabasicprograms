package Multithreading;

public class DemoMain {

	public static void main(String[] args) {
		Display d=new Display();
		
		
		MyThread t1=new MyThread(d,"Krishna");
		MyThread t2=new MyThread(d,"Jadhav");
		MyThread t3=new MyThread(d,"Shivam");
		t1.start();
		t2.start();
		t3.start();
		/*
		    // In this case synchronization is not Required because two thred oprating on diffrent object :
		      (synchronizaton also does not work because two thread aquring diffrent Lock of Diffrent Object)
		      
		     
		 	Display d1=new Display();
		    Display d2=new Display();

		
			MyThread t1=new MyThread(d1,"Krishna");
			MyThread t2=new MyThread(d2,"Jadhav");
			
			t1.start();
			t2.start();
		 */
		
		// TODO Auto-generated method stub

	}

}
