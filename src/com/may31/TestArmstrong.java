package com.may31;

import java.util.Scanner;

public class TestArmstrong {
	
	public static void main(String[] args) {
		
		Armstrong a1 = new Armstrong();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n1 = sc.nextInt();
		
		a1.checkArm(n1);
	}

}
