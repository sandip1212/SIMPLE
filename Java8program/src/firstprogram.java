import java.util.function.*;
//@FunctionalInterface
//public class firstprogram
//{
	interface inter
	{	
	public void add();
	
	}
	class firstprogram
	{//System.out.println("hello");
	
	public static void main(String args[])
	
	{
		inter i =() -> System.out.println("heloo");
	//firstprogram a=new firstprogram();
	i.add();
	}
}
//}
