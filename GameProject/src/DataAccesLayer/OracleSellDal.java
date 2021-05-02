package DataAccesLayer;

import Abstract.ISellDal;
import Entities.Game;
import Entities.Sell;
import Entities.UserBase;

public class OracleSellDal implements ISellDal {

	@Override
	public void Add(Sell sell, Game game, UserBase user) {
		System.out.println("order added to Oracle database:"+sell.getSellNumber());
		
	}

	@Override
	public void Delete(Sell sell, Game game, UserBase user) {
		System.out.println("order deleted to Oracle database:"+sell.getSellNumber());
		
	}

	@Override
	public void Uptade(Sell sell, Game game, UserBase user) {
		System.out.println("orderuptaded to Oracle database:"+sell.getSellNumber());
		
	}

}
