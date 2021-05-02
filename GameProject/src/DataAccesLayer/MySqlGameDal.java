package DataAccesLayer;

import Abstract.IGameDal;
import Entities.Game;

public class MySqlGameDal  implements IGameDal{

	@Override
	public void Add(Game game) {
		
		System.out.println("New game Added to MySql database:"+game.getName());
	}

	@Override
	public void Uptade(Game game) {
		
		System.out.println("Game Uptaded to MySql database:"+game.getName());
	}

	@Override
	public void Delete(Game game) {
		
		System.out.println("Game Deleted to MySql database:"+game.getName());
	}

}
