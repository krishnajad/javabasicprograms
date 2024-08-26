package collection;
class GenericDemo2<T,U>{
	T id;
	U name;
	GenericDemo2(T id,U name){
		this.id=id;
		this.name=name;
		
	}
	
	
	
}

public class GenericExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericDemo2<Integer,String> obj=new GenericDemo2<Integer,String>(1,"krishna");
		System.out.println(obj.name+obj.id);
		

	}

}
