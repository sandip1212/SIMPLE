class MyThread extends Thread
{
	public void run()
	
	{
		for(int i=0;i<10;i++)
		{
		System.out.println("child thread");
		}
		}
	
	public void run(int i)
	{
		for(i=0;i<10;i++)
		{
		System.out.println("heelo guys");
		}
		}
	
}
class extendthread
{
	public static void main(String args[])
	{
		MyThread t=new MyThread();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("parent class");
		}
		for(int i=0;i<10;i++)
		{
			System.out.println("freinds");
		}
	}
}