package com.may31;

public class M_Pattern {
 
	void printPattern(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0 || j==n-1 || (i==j && j<=n/2)|| (i+j==n && j<=n/2))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}
