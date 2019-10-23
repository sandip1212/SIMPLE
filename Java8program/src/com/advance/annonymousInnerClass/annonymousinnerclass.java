package com.advance.annonymousInnerClass;

import java.util.Scanner;

class annonymousinnerclass
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two number");
		int c=sc.nextInt();
		int d=sc.nextInt();
		
		annonymousinnerclass p=new annonymousinnerclass()
				{
			public void add(int a,int b)
			{
				int sum=a+b;
				System.out.println("addition"+sum);
			}
			public void sub(int a,int b)
			{
				int sub=a-b;
				System.out.println("subtraction"+sub);
			}
				};
				
			p.add(c,d);
			p.sub(c,d);
	}
}