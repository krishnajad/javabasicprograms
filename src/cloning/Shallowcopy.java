package cloning;
class Cat{
	int j;
	Cat(int j){
		this.j=j;
		
	}
}
class Dog implements Cloneable{
	int i;
	Cat c;
	Dog(Cat c,int i){
		this.c=c;
		this.i=i;
		
	}
	  public Object clone() throws CloneNotSupportedException 
	    { 
	        return super.clone(); 
	    } 
	
}

public class Shallowcopy {

	public static void main(String[] args)throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Cat c=new Cat(20);
		Dog d1=new Dog(c,10);
		Dog d2=(Dog)d1.clone();
		System.out.println(d1.i+"-----"+d1.c.j);
		System.out.println(d2.i+"-----"+d2.c.j);
		d1.i=40;
		d2.i=50;
		d2.c.j=100;   
		System.out.println(d1.i+"-----"+d1.c.j);
		System.out.println(d2.i+"-----"+d2.c.j);

		

	}

}
