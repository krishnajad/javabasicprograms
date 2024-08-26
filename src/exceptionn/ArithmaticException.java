package exceptionn;

public class ArithmaticException {

	public static void main(String[] args) {
		try {
			int c;
			c=10/0;
			System.out.println(c);
		
			
		} catch (ArithmeticException e) {
			System.out.println("divisible by zero is not valid");
			// TODO: handle exception
		}
		// TODO Auto-generated method stub

	}

}
