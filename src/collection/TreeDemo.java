package collection;

import java.util.TreeSet;

public class TreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t=new TreeSet(new Mycomparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(20);
		t.add(5);
		t.add(20);
		System.out.println(t);

	}

}
