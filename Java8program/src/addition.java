//USING FUNCTIONAL INTERFACE
//@FunctionalInterface
interface interf
{
	public void add(int a,int b);
}

class addition
{
	public static void main(String args[])
	{
		interf i=(a,b) -> System.out.println("Addition="+a+b);
		i.add(20, 2);
	}
}

// USING OBJECT CENCEPT


/*class addition
{
public void add(int a,int b)
{
System.out.println("Addiyion:"+(a+b));	
}
public static void main(String args[])
{
addition a=new addition();
a.add(10, 20);
}
}*/