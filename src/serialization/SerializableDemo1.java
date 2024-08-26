package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SerializationExample1 s1=new SerializationExample1();
		s1.name="krishna";
		s1.id=1;
		String fileName="E:\\Todo\\SerializationDemo1.txt";
		try {
			FileOutputStream fos=new FileOutputStream(fileName);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(s1);
			oos.close();
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("object saved to file");
		

	}

}
