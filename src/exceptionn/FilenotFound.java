package exceptionn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FilenotFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fr=new FileInputStream("a.txt");
			System.out.println("file found");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("file not found");
			e.printStackTrace();
		}

	}

}
