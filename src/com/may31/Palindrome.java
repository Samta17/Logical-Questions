package com.may31;

public class Palindrome {
	
	void checkNum(int n)
	{
		int dup=n;
		int rev=0;
		while(n>0)
		{
			int rem = n%10;
			rev= (rev*10)+rem;
			n= n/10;
		}
		if(dup==rev)
		{
			System.out.println(dup+" is a palindrome number.");
		}
		else
		{
			System.out.println(dup+" is not a palindrome number.");
		}
	}

}
