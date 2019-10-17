package simple;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectInputValidation;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class dog implements Serializable{
	int i=10;
	transient int j=20;
	
}
public class SerializeDemo {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
	//this is serialzation
		dog d1=new dog();
	FileOutputStream fos=new FileOutputStream("abc.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(d1);
	
	FileInputStream fis=new FileInputStream("abc.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	
	dog d2=(dog)ois.readObject();
	System.out.println(d2.i+"---------"+d2.j);
	

	}

}
