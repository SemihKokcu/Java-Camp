package Adapters;

import Abstract.IUserCheckService;
import Entities.UserBase;

public class UserCheckManager implements IUserCheckService {

	@Override
	public boolean checkIfRealPerson(UserBase user) {
		
		return true;
	}

}
