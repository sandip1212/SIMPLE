
import java.util.function.Function;
@FunctionalInterface
// 
interface interr
{
	
public  void m1(int i);


public	class refernceoperator
	{
	public void m2(int i)
	{
		System.out.println("reference"+i);
	}
	

/*	public static void m1()
	{
		for(int i=1;i<=10;i++ ) {
			
		System.out.println("child class");
		}
	}*/

	public static void main(String[] args)
	{
		interr f=i -> System.out.println("lambda"+i);
			f.m1(10);
			refernceoperator t=new refernceoperator();
			interr i1= t::m2;
			i1.m1(20);
		/*Runnable r= refernceoperator ::  m1 ;
		Thread t=new Thread(r);
		t.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("parent class");
			//Function<String, Integer> f=s ->s.length();
			//System.out.println(f.apply(""+m1));
		}*/
		// TODO Auto-generated method stub

		/*Runnable r=() ->{ for(int i=0;i<10;i++)
		{
			System.out.println("child class");
		}
		};
		
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<=10;i++)
		{
			System.out.println("thread class");
		}*/
		
		
	}

}
}