package Abstract;

import Entities.Game;

public interface IGameDal {
	void Add(Game game);
    void Uptade(Game game);
    void Delete(Game game);
}
