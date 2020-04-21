package it.xpug.ocp.customerbase;
import java.util.*;


public abstract class CustomerBase {

	private List<Customer> customers = new ArrayList<Customer>();

	public void add(Customer customer) {
		customers.add(customer);
	}
	

	abstract List<Customer> findBy(List<Customer> customers,String firstName, String lastName, int credit);
}
