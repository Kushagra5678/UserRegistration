package com.practice.UC7;

import java.util.*;

public class UserRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String password=sc.nextLine();
		System.out.println(password.matches("(?=.*[0-9])(?=.*[A-Z])[^\\s].{8,}"));
	}

}
