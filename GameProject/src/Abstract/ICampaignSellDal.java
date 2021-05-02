package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.UserBase;

public interface ICampaignSellDal {
	void Add(Campaign campaign,UserBase user,Game game);
	void Uptade(Campaign campaign,UserBase user,Game game);
	void Delete(Campaign campaign,UserBase user,Game game);

}
