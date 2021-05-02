package DataAccesLayer;

import Abstract.ICampaignSellDal;
import Entities.Campaign;
import Entities.Game;
import Entities.UserBase;

public class MySqlCampaignSellDal implements ICampaignSellDal {

	@Override
	public void Add(Campaign campaign, UserBase user, Game game) {
		System.out.println("Campaign sell added to MySql databasae"+campaign.getCampaignName()+"/"+user.getFirstName()+"/"+game.getName());
		
	}

	@Override
	public void Uptade(Campaign campaign, UserBase user, Game game) {
		System.out.println("Campaign sell uptaded to MySql databasae"+campaign.getCampaignName()+"/"+user.getFirstName()+"/"+game.getName());
		
	}

	@Override
	public void Delete(Campaign campaign, UserBase user, Game game) {
		System.out.println("Campaign sell deleted to MySql databasae"+campaign.getCampaignName()+"/"+user.getFirstName()+"/"+game.getName());
		
	}

}
