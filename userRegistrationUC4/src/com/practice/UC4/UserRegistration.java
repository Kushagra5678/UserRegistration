package com.practice.UC4;
import java.util.*;
public class UserRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String number=sc.nextLine();
		boolean x = number.matches("(91)[7-9][0-9]{9}");
		System.out.println(x);
	}

}
