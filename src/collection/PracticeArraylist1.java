package collection;

import java.util.ArrayList;

public class PracticeArraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		//Adding Element in arraylist
		list.add("Orange");
		list.add("Red");
		list.add("White");
		list.add("Yellow");
		list.add("Orange");
		System.out.println(list);
		//Iterating ArrayList
		
//		for(String s:list) {
//			System.out.print(s+" ");
//		}
		System.out.println();
		list.add(1,"Purple");
		list.add(4,"Green");

		System.out.println(list);
		String element=list.get(4);
		System.out.println();
		System.out.println("n th element in list:- "+element);
		System.out.println();
		list.remove(4);
		System.out.println("list after removing element:- "+list);

	}

}
