package Abstract;

import Entities.Game;
import Entities.Sell;
import Entities.UserBase;

public abstract  class BaseSellManager implements ISellService{

	@Override
	public void sellAdd(Sell sell,Game game, UserBase user) {
		System.out.println("Sell number :"+ sell.getSellNumber()+ "This user "+user.getFirstName()+"order to buy this game"+game.getName()+"\t"+game.getDetail());
		
	}

	@Override
	public void sellUptade(Sell sell, Game game, UserBase user) {
		System.out.println("Sell number :"+ sell.getSellNumber()+ "This user "+user.getFirstName()+"order to buy uptade this game"+game.getName()+"\t"+game.getDetail());
		
	}

	@Override
	public void sellDelete(Sell sell, Game game, UserBase user) {
		System.out.println("Sell number :"+ sell.getSellNumber()+ "This user "+user.getFirstName()+"cansel to buy this game"+game.getName()+"\t"+game.getDetail());
		
	}

	

}
