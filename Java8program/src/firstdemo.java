@FunctionalInterface
interface firstdemo
{
	public void square(int a);



public static void main(String args[])
   {
	firstdemo i= (a)-> System.out.println((a*a));
	i.square(7);
   }
}
