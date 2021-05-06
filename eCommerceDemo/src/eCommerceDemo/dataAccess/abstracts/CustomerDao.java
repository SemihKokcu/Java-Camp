package eCommerceDemo.dataAccess.abstracts;

import java.util.List;

import eCommerceDemo.entities.concretes.Customer;


public interface CustomerDao {
	void add(Customer customer);
	void uptade(Customer customer);
	void delete(Customer customer);
	Customer get(int id);
	List<Customer> getAll();
}
