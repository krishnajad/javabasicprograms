package arrays.ArrayMethodImplimentation;

public class ArrayMethodCalling {

	public static void main(String[] args) {
		
		ArrayMethodImplimentation arrayF = new ArrayMethodImplimentation();

	        arrayF.add(5);
	        arrayF.add(10);
	        arrayF.add(15);
	        System.out.print("Array after additions: ");
	        arrayF.printArray();

	        arrayF.remove(10);
	        System.out.print("Array after removing 10: ");
	        arrayF.printArray();

	        arrayF.remove(20);  // Attempting to remove an element not in the array
	        System.out.print("Array after attempting to remove 20: ");
	        arrayF.printArray();

	}

}


