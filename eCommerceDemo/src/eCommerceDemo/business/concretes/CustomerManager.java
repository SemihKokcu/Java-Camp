package eCommerceDemo.business.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceDemo.business.abstracts.CustomerService;
import eCommerceDemo.core.abstracts.ValidateService;
import eCommerceDemo.entities.concretes.Customer;

public class CustomerManager implements CustomerService{

	private ValidateService validateService;
	
	private ArrayList<String> eMailList = new ArrayList<String>();
	
	
	public CustomerManager(ValidateService validateService) {
		
		this.validateService = validateService;
	}


	@Override
	public void add(Customer customer) {
		
		
		if (eMailList.contains(customer.getEmail()) ) {
			System.out.println("e mail adresi kullan�mda");
			return;
		}
		
		if (customer.getPassword().length() <= 6) {
			System.out.println("Parola en az 6 karakterden olu�mal�d�r.");
			return ;
		}
		
		
		if (customer.getFirstName().length()<=2 || customer.getLastName().length()<=2)  {
			System.out.println("Ad ve Soyad en az iki karakterden olu�mal�d�r.");
			return ;
		}
		if (validateService.validate(customer.getEmail()) == false) {
			System.out.println("L�tfen e postan�z� do�ru girdi�inize emin olunuz");
			return;
		}else {
			eMailList.add(customer.getEmail());
		}
		
		System.out.println("Kullan�c� eklendi : "+customer.getFirstName());
		
		
		
	
		
	}

	@Override
	public void delete(Customer customer) {
		
		
	}

	@Override
	public void uptade(Customer customer) {
		
		
	}

	@Override
	public List<Customer> getAll() {
		
		return null;
	}

}
