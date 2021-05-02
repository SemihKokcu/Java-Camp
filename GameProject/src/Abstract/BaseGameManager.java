package Abstract;

import Entities.Game;

public abstract class BaseGameManager  implements IGameService{

	@Override
	public  void Add(Game game) {
		
		System.out.println("New game Added :"+game.getName());
		
	}

	@Override
	public void Uptade(Game game) {
		
		System.out.println("Game Uptaded :"+game.getName());
		
	}

	@Override
	public void Delete(Game game) {
		
		System.out.println("Game Deleted :"+game.getName());
	}

}
