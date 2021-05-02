package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.UserBase;

public interface ICampaignSellService {
		void AddCampaignSell(Campaign campaign,UserBase user,Game game);
		void UptadeCampaignSell(Campaign campaign,UserBase user,Game game);
		void DeleteCampaignSell(Campaign campaign,UserBase user,Game game);
}
