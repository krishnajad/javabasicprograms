package collection;

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericDemo<Integer> obj=new GenericDemo<Integer>(1);
		System.out.println(obj.id);

	}
	

}
class GenericDemo<T>{
	T id ;
	
	
	GenericDemo(T id){
		this.id=id;
		
		
	}

}