package DataAccesLayer;

import Abstract.ISellDal;
import Entities.Game;
import Entities.Sell;
import Entities.UserBase;

public class MySqlSellDal implements ISellDal{

	@Override
	public void Add(Sell sell, Game game, UserBase user) {
		System.out.println("order added to MySql database:"+sell.getSellNumber());
		
	}

	@Override
	public void Delete(Sell sell, Game game, UserBase user) {
		System.out.println("order deleted to MySql database:"+sell.getSellNumber());
		
	}

	@Override
	public void Uptade(Sell sell, Game game, UserBase user) {
		System.out.println("order uptaded to MySql database:"+sell.getSellNumber());
		
	}

}
