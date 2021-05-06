package eCommerceDemo.business.concretes;

import eCommerceDemo.GoogleLogIn.abstracts.GoogleService;
import eCommerceDemo.core.abstracts.LoginAdapterService;
import eCommerceDemo.entities.concretes.Customer;

public class LoginToGoogleAdapter implements LoginAdapterService {

	private GoogleService google;
	public LoginToGoogleAdapter(GoogleService google) {
		
		this.google = google;
	}
	@Override
	public void logIn(Customer customer) {
		
		google.logInToGoogle(customer.getFirstName());
	}

}
