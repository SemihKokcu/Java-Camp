package DataAccesLayer;

import Abstract.IUserDal;
import Entities.UserBase;

public class MySqlUserDal implements IUserDal{

	@Override
	public void Add(UserBase user) {
		System.out.println("New user Added to MySql database:"+user.getFirstName());
		
	}

	@Override
	public void Uptade(UserBase user) {
		
		System.out.println("New user Uptaded to MySql database:"+user.getFirstName());
	}

	@Override
	public void Delete(UserBase user) {
		
		System.out.println("New user Deleted to MySql database:"+user.getFirstName());
	}

}
