package simple;
import java.io.*;

//import jdk.internal.org.jline.utils.WriterOutputStream;
class Account implements Serializable
{
String username="sandip";
transient String pass="lanke";

private void writeObject(ObjectOutputStream os)throws Exception 
{ 
	os.defaultWriteObject();
	String epass="123"+pass;
	os.writeObject(epass);
}

private void readObject(ObjectInputStream is)throws Exception
{
	is.defaultReadObject();
	String epass=(String)is.readObject();
	pass=epass.substring(3);
	//System.out.println(epass);
}
	// TODO Auto-generated method stub

}






public class customizedSerialzation implements Serializable
{

	public static void main(String[] args) throws Exception
	{
		Account a=new Account();
		System.out.println(a.username+"----"+a.pass);
		
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a);
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Account a1=(Account)ois.readObject();
		
		System.out.println(a1.username+"------"+a1.pass);// TODO Auto-generated method stub

	}

}
