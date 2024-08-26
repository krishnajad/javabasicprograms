package arrays.ArrayMethodImplimentation;

public class ArrayMethodImplimentation {
	 private int[] array;
	    private int size;

	    public ArrayMethodImplimentation() {
	        array = new int[20];
	        size = 0;
	    }

	    public void add(int element) {
	        if (size < 20) {
	            array[size] = element;
	            size++;
	        } else {
	            System.out.println("Array is full. Cannot add more elements.");
	        }
	    }

	    public void remove(int element) {
	        boolean found = false;
	        for (int i = 0; i < size; i++) {
	            if (array[i] == element) {
	                found = true;
	                for (int j = i; j < size - 1; j++) {
	                    array[j] = array[j + 1];
	                }
	                size--;
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("Element not found in the array.");
	        }
	    }

	    public void printArray() {
	        for (int i = 0; i < size; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();
	    }

}
