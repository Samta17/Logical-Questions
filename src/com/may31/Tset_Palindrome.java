package com.may31;

import java.util.Scanner;

public class Tset_Palindrome {

	public static void main(String[] args) {
		
		Palindrome p1 = new Palindrome();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n1 = sc.nextInt();
		p1.checkNum(n1);
	}
}
