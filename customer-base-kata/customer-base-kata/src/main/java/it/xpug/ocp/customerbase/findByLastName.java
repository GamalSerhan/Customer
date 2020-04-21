package it.xpug.ocp.customerbase;

import java.util.ArrayList;
import java.util.List;

public class findByLastName extends CustomerBase {

	public findByLastName(String firstName, String lastName, int credit) {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	List<Customer> findBy(List<Customer> customers, String firstName, String lastName, int credit) {
		List<Customer> result = new ArrayList<Customer>();
		for (Customer customer : customers)
		{
			if (customer.lastName().equals(lastName)) 
			{
				result.add(customer);
			}
		}
		return result;
	}

}
