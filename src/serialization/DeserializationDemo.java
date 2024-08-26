package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName="E:\\\\Todo\\\\SerializationDemo1.txt";
		try {
			FileInputStream fis=new FileInputStream(fileName);
			ObjectInputStream ois=new ObjectInputStream(fis);
			SerializationExample1 s=(SerializationExample1)ois.readObject();
			System.out.println(s.id);
			System.out.println(s.name);
			fis.close();
			ois.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
