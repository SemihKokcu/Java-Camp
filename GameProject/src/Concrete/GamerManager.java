package Concrete;

import Abstract.BaseGamerManager;
import Abstract.IUserCheckService;
import Abstract.IUserDal;
import Entities.UserBase;

public class GamerManager extends BaseGamerManager {

	private IUserCheckService userCheckService;
	private IUserDal userDal;
	
	
	public GamerManager(IUserCheckService userCheckService,IUserDal userDal) {
		
		this.userCheckService = userCheckService;
		this.userDal = userDal;
	}

	@Override
	public void Add(UserBase user) {
		if (this.userCheckService.checkIfRealPerson(user)) {
			super.Add(user);
			userDal.Add(user);
		}else {
			System.out.println("this is not real person");
		}
		
	}

	@Override
	public void Uptade(UserBase user) {
		if (this.userCheckService.checkIfRealPerson(user)) {
			super.Uptade(user);
			userDal.Uptade(user);
		}else {
			System.out.println("this is not real person");
		}
		
	}

	@Override
	public void Delete(UserBase user) {
		if (this.userCheckService.checkIfRealPerson(user)) {
			super.Delete(user);
			userDal.Delete(user);
		}else {
			System.out.println("this is not real person");
		}
		
	}
	
	
}
