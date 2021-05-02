package Concrete;

import Abstract.BaseSellManager;
import Abstract.ISellDal;
import Abstract.IUserCheckService;
import Entities.Game;
import Entities.Sell;
import Entities.UserBase;

public class SellManager extends BaseSellManager {

	private IUserCheckService userCheckService ;
	private ISellDal sellDal;
	
	public SellManager(IUserCheckService userCheckService,ISellDal sellDall) {
		
		this.userCheckService = userCheckService;
		this.sellDal = sellDall;
	}

	@Override
	public void sellAdd(Sell sell,Game game, UserBase user) {
		
		if (userCheckService.checkIfRealPerson(user)) {
			super.sellAdd(sell,game, user);
			sellDal.Add(sell, game, user);
			
		}else {
			System.out.println("order not received , because this user not real");
		}
	}

	@Override
	public void sellUptade(Sell sell, Game game, UserBase user) {
		if (userCheckService.checkIfRealPerson(user)) {
			super.sellUptade(sell, game, user);
			sellDal.Uptade(sell, game, user);
			
		}else {
			System.out.println("order not uptaded , because this user not real");
		}
	}
		
		
	

	@Override
	public void sellDelete(Sell sell, Game game, UserBase user) {
		if (userCheckService.checkIfRealPerson(user)) {
			super.sellDelete(sell, game, user);	
			sellDal.Delete(sell, game, user);
			
		}else {
			System.out.println("order not deleted, because this user not real");
		}
			
	}
}
