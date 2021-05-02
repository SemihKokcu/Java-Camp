package DataAccesLayer;

import Abstract.IUserDal;
import Entities.UserBase;

public class OracleUserDal implements IUserDal {

	@Override
	public void Add(UserBase user) {
		
		System.out.println("New user Added to Oracle database"+user.getFirstName());
	}

	@Override
	public void Uptade(UserBase user) {
		
		System.out.println("New user Uptaded to Oracle database"+user.getFirstName());
		
	}

	@Override
	public void Delete(UserBase user) {
		
		System.out.println("New user Deleted to Oracle database"+user.getFirstName());
		
	}

}
