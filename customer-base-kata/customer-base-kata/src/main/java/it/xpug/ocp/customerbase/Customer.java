package it.xpug.ocp.customerbase;

import java.util.ArrayList;
import java.util.List;

abstract class Customer {

	private String firstName;
	private String lastName;
	private int credit;

	public Customer(String firstName, String lastName, int credit) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.credit = credit;
	}

	@Override
	public String toString() {
		return String.format("(Customer %s %s)", firstName, lastName);
	}

	public String lastName() {
		return lastName;
	}

	public String firstName() {
		return firstName;
	}

	public int credit() {
		return credit;
	}
}
