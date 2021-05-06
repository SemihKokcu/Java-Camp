package eCommerceDemo.business.concretes;


import eCommerceDemo.business.abstracts.LoginService;

import eCommerceDemo.entities.concretes.Customer;


public class LogInManager implements LoginService{

	
	
	
	@Override
	public void logIn(Customer customer ,String email, String password) {
		
		
		if (email != customer.getEmail()) {
			System.out.println("Lütfen e postanýzý doðru girdiðinize emin olunuz");
			
		}else {
			 if ((password != customer.getPassword())) {
				System.out.println("Lütfen parolanýzý girdiðinize emin olunuz");
			}
			
			else {
				System.out.println("giriþ baþarýlý");
			}
		}
			
		

	
	}
	}	
	


