package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService customerCheckService; 
	
	public NeroCustomerManager(ICustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}

	@Override
	public  void Save(Customer customer) {
		
		if (this.customerCheckService.checkIfRealPerson(customer)) {
			super.Save(customer);
		}else {
			System.out.println("Not a real Person");
		}
		
		

}
}
