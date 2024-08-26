package collection;

import java.util.Stack;
import java.util.Vector;

public class VectorExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <String> v=new Vector<String>(5,5);
		v.add("orange");
		v.add("green");
		v.add("yellow");
		v.add("blue");
		v.add("red");
		v.add("ehite");
		
		System.out.println(v);
		System.out.println(v.capacity());
		Stack s=new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s);
		System.out.println(s.search(s));
		
		
		

	}

}
