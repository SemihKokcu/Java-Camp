package eCommerceDemo.business.concretes;


import eCommerceDemo.business.abstracts.LoginService;

import eCommerceDemo.entities.concretes.Customer;


public class LogInManager implements LoginService{

	
	
	
	@Override
	public void logIn(Customer customer ,String email, String password) {
		
		
		if (email != customer.getEmail()) {
			System.out.println("L�tfen e postan�z� do�ru girdi�inize emin olunuz");
			
		}else {
			 if ((password != customer.getPassword())) {
				System.out.println("L�tfen parolan�z� girdi�inize emin olunuz");
			}
			
			else {
				System.out.println("giri� ba�ar�l�");
			}
		}
			
		

	
	}
	}	
	


