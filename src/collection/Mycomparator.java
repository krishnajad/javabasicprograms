package collection;

import java.util.Comparator;

public  class Mycomparator implements Comparator {
	
	

	@Override
	public int compare(Object o1, Object  o2) {
		// TODO Auto-generated method stub
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		
		return -i1.compareTo(i2);
	}

}
