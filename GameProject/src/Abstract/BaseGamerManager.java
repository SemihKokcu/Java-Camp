package Abstract;

import Entities.UserBase;

public abstract  class BaseGamerManager implements IUserService{

	@Override
	public void Add(UserBase user) {
		System.out.println("New User Added :"+user.getFirstName());
		
	}

	@Override
	public void Uptade(UserBase user) {
		System.out.println(" User Uptaded:"+user.getFirstName());
		
	}

	@Override
	public void Delete(UserBase user) {
		System.out.println("User Deleted :"+user.getFirstName());
		
	}

	

}
