package eCommerceDemo.business.abstracts;

import eCommerceDemo.entities.concretes.Customer;

public interface LoginService {

	void logIn(Customer customer ,String email, String Password);
}
