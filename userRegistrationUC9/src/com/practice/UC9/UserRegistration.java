package com.practice.UC9;

import java.util.*;

public class UserRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String email=sc.nextLine();
		//boolean x = email.matches("[a-zA-Z0-9+_-]+(.[a-zA-Z0-9+_-]*)@");
		//boolean x=email.matches("([^\\s])+");
		//boolean x=email.matches("[.][\\w]{1,}");
		//boolean x=email.matches("[.][\\w]{3,}.?");ignore
		//boolean x=email.matches("[.][a-zA-Z]{2}.?");ignore
		//boolean x=email.matches("([.][\\\\w]{3,}.?|[.][a-zA-Z]{2}.?)?");
		boolean x = email.matches("[a-zA-Z0-9+_-]+(.[a-zA-Z0-9+_-]*)@([^\\s])+[.][\\w]{1,}([.][\\w]{3,}.?|[.][a-zA-Z]{2}.?)?");
		System.out.println(x);
	}

}
