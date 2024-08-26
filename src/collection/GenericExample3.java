package collection;

public class GenericExample3 {
	 static <T>void demo(T element){
			System.out.println(element.getClass().getName()+"="+element);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo(1);
		demo("krishna");
		demo(10.5);

	}

}
