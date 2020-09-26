package com.practice.UC2;

import java.util.Scanner;

public class UserRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter first name");
		Scanner sc=new Scanner(System.in);
		String lname=sc.nextLine();
		boolean x = lname.matches("[A-Z][a-z]{2,}");
		System.out.println(x);
	}

}
