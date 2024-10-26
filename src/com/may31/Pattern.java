package com.may31;

public class Pattern {
	
	public static void squarePattern(int n)
	{
	  for(int rows=1; rows<=n; rows++)
	    {
		  for(int cols=1; cols<=(n-rows)+1; cols++)
		    {
			   System.out.print(cols+" ");
		    }
		      System.out.println();
	    }
    }
	
}
