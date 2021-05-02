package Abstract;

import Entities.Game;
import Entities.Sell;
import Entities.UserBase;

public interface ISellDal {
	
	void Add(Sell sell,Game game,UserBase user);
	void Delete(Sell sell,Game game,UserBase user);
	void Uptade(Sell sell,Game game,UserBase user);

}
