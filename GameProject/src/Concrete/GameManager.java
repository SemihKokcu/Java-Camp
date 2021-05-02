package Concrete;

import Abstract.BaseGameManager;
import Abstract.IGameDal;
import Entities.Game;

public class GameManager extends BaseGameManager{
	
	private IGameDal gameDal;
	
	public GameManager(IGameDal gameDal) {
		
		this.gameDal = gameDal;
	}

	@Override
	public  void Add(Game game) {
		
		super.Add(game);
		gameDal.Add(game);
		
	}

	@Override
	public void Uptade(Game game) {
		
		super.Uptade(game);
		gameDal.Uptade(game);
		
		
	}

	@Override
	public void Delete(Game game) {
		
		super.Delete(game);
		gameDal.Delete(game);
	}

	

}
