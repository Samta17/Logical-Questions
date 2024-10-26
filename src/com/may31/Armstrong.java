package com.may31;

public class Armstrong {
	
	int countDigit(int n) {
		int count = 0;
		while(n>0) {
			count+=1;
			n = n/10;
		}
		return count;
	}

	void checkArm(int n) {
		Armstrong a1 = new Armstrong();
		int count = a1.countDigit(n);
		System.out.println("Number of digits in number : "+count);
		
		int sum = 0;
		int dup = n;
		while(n>0) {
			int rem = n % 10;
			sum += Math.pow(rem,count);
			n = n/10;
		}
		
		if(sum == dup)
		{
			System.out.println(dup+" is a armstrong number.");
		}
		else
		{
			System.out.println(dup+" is not a armstrong number.");
		}
	}
}
