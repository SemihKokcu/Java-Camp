package Abstract;

import Entities.Game;
import Entities.Sell;
import Entities.UserBase;

public interface ISellService {
  void sellAdd(Sell sell,Game game,UserBase user);
  void sellUptade(Sell sell,Game game,UserBase user);
  void sellDelete(Sell sell,Game game,UserBase user);
  
}
