package eCommerceDemo;

import eCommerceDemo.GoogleLogIn.concretes.GoogleManager;
import eCommerceDemo.business.abstracts.CustomerService;
import eCommerceDemo.business.abstracts.LoginService;
import eCommerceDemo.business.concretes.CustomerManager;
import eCommerceDemo.business.concretes.LogInManager;
import eCommerceDemo.business.concretes.LoginToGoogleAdapter;
import eCommerceDemo.core.abstracts.LoginAdapterService;
import eCommerceDemo.core.concretes.EmailValidateManager;
import eCommerceDemo.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		

		
		
		
		
		
		CustomerService customerService = new CustomerManager(new EmailValidateManager());
		Customer customer = new Customer(1,"Semih,","Kökçü","semihkokcu3@gmail.com","123456789");
		Customer customer2 = new Customer(2,"Melih","Kökçü","melihkokcu33@gmail.com","987654321");
		customerService.add(customer);
		customerService.add(customer2);
		
		LoginService loginService = new LogInManager();
		loginService.logIn(customer,"semihkokcu3@gmail.com", "123456789");
		
		System.out.println("*************************************************");
		
		LoginAdapterService loginAdapter = new LoginToGoogleAdapter(new GoogleManager() );
		loginAdapter.logIn(customer2);
		
		
	}

}
