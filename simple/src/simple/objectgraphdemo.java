package simple;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class dog implements Serializable
{
	cat a=new cat();
	
}
class cat implements Serializable
{
	rat r=new rat();
	
}
class rat implements Serializable
{
	int i=20;
	
}
public class objectgraphdemo
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		dog d1=new dog();
		
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		dog d2=(dog)ois.readObject();
		
		System.out.println(d2.a.r.i);

	}

}
