package analysis;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SerializationOfArrayList {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		List list = Arrays.asList(new String[] { "A", "B", "C", "D" });
	    FileOutputStream fos = new FileOutputStream("list.ser");
	    ObjectOutputStream oos = new ObjectOutputStream(fos);
	    oos.writeObject(list);
	    oos.close();

	    FileInputStream fis = new FileInputStream("list.ser");
	    ObjectInputStream ois = new ObjectInputStream(fis);
	    List anotherList = (List) ois.readObject();
	    ois.close();

	    System.out.println(anotherList);
	}

}
