package com.qa.app;

import com.qa.domain.Person;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello banking");
		Person john = new Person();
		john.setFirstName("John");
		System.out.println("The name of the customer is " + john.getFirstName());

	}

}
