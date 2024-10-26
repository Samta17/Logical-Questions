package com.may31;

public class Fibonacci {
	
	void printFiboSeries(int n)
	{
		int n1=0;
		int n2=1;
		int n3;
		
		System.out.println("Fibonacci series : ");
		System.out.println(n1+"\n"+n2);
		for(int i = 2; i<=n; i++)
		{
			n3 = n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}
	}

}
