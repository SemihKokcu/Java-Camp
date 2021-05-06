package eCommerceDemo.business.abstracts;

import java.util.List;

import eCommerceDemo.entities.concretes.Customer;



public interface CustomerService  {

	void add(Customer customer);
	void delete(Customer customer);
	void uptade(Customer customer);
	List<Customer> getAll();

}
