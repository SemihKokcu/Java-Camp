package eCommerceDemo.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceDemo.core.abstracts.ValidateService;

public class EmailValidateManager implements ValidateService {
	

	@Override
	public boolean validate(String input) {
		
		String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern emailPat = java.util.regex.Pattern.compile(emailRegex, java.util.regex.Pattern.CASE_INSENSITIVE);
		Matcher matcher = emailPat.matcher(input);
		return matcher.find();
	}

}
