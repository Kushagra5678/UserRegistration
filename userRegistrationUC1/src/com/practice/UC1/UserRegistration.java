package com.practice.UC1;
import java.util.*;
public class UserRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter first name");
		Scanner sc=new Scanner(System.in);
		String fname=sc.nextLine();
		boolean x = fname.matches("[A-Z][a-z]{2,}");
		System.out.println(x);
	}

}
