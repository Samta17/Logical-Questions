package com.may31;

public class PrimeNumber {

	public static void CheckNum(int n)
	{
		int count=0;
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				 count++;
			}
		}
		
		if(count == 2)
		{
			System.out.println(n+" is a prime number.");
		}
		else
		{
			System.out.println(n+" is not a prime number.");
		}
	}
	
	public static void CheckNum1(int n)
	{
		int count=0;
		for(int i=2; i<n; i++)
		{
			if(n%i==0)
			{
				 count++;
			}
		}
		
		if(count == 0)
		{
			System.out.println(n+" is a prime number.");
		}
		else
		{
			System.out.println(n+" is not a prime number.");
		}
	}
	
	public static void CheckNum2(int n)
	{
		int count=0;
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				 count++;
			}
		}
		
		if(count == 0)
		{
			System.out.println(n+" is a prime number.");
		}
		else
		{
			System.out.println(n+" is not a prime number.");
		}
	}
	
	public static void CheckNum3(int n)
	{
		int count=0;
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				 count++;
				 break;
			}
		}
		
		if(count == 0)
		{
			System.out.println(n+" is a prime number.");
		}
		else
		{
			System.out.println(n+" is not a prime number.");
		}
	}
}
