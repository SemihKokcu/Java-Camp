package DataAccesLayer;

import Abstract.IGameDal;
import Entities.Game;

public class OracleGameDal implements IGameDal {

	@Override
	public void Add(Game game) {
		System.out.println("New game Added to Oracle database:"+game.getName());
		
	}

	@Override
	public void Uptade(Game game) {
		System.out.println("New game Uptaded to Oracle database:"+game.getName());
		
	}

	@Override
	public void Delete(Game game) {
		System.out.println("New game Deleted to Oracle database:"+game.getName());
		
	}

}
