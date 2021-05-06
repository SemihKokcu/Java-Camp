package eCommerceDemo.GoogleLogIn.concretes;

import eCommerceDemo.GoogleLogIn.abstracts.GoogleService;

public class GoogleManager implements GoogleService{

	@Override
	public boolean logInToGoogle(String message) {
		System.out.println("google ile giriþ yapýldý"+message);
		return true;
	}

}
