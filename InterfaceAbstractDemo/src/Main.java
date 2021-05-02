





import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	
	public static void main(String[] args) {
		
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setFirstName("Semih");
		customer1.setLastName("Kökçü");
		customer1.setNationalityId("31531227352");
		customer1.setDateOfBirth(2000);
		
		//System.out.println(customer1.getDateOfBirth());
		
		BaseCustomerManager customerManager1 = new NeroCustomerManager(new MernisServiceAdapter() );
		BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager1.Save(customer1);
		customerManager2.Save(customer1);
		
		
		 

	}

}
