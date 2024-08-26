package cloning;
class Monkey{
	int j;
	Monkey(int j){
		this.j=j;
	}
}
class Animal implements Cloneable{
	int i;
	Monkey m;
	Animal(Monkey m,int i){
		this.m=m;
		this.i=i;
		
	}
	public Object clone()throws CloneNotSupportedException{
		Monkey m1=new Monkey(m.j);
		Animal a=new Animal(m1,i);
		return a;
		
	}
}
public class Deepcopy {

	public static void main(String[] args)throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Monkey m=new Monkey(20);
		Animal a1=new Animal(m,10);
		Animal a2=(Animal)a1.clone();
		System.out.println(a1.i+"-----"+a1.m.j);
		System.out.println(a2.i+"-----"+a2.m.j);
		a2.m.j=100;
		System.out.println(a2.i+"-----"+a2.m.j);
		System.out.println(a1.i+"-----"+a1.m.j);

	}

}
