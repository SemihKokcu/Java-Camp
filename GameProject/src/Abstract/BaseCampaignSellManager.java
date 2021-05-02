package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.UserBase;

public abstract class BaseCampaignSellManager implements ICampaignSellService{

	@Override
	public void AddCampaignSell(Campaign campaign, UserBase user, Game game) {
		
		System.out.println("Added the CampaignSell"+"\nCampaign :"+campaign.getCampaignName()+"\nUser :"+user.getFirstName()+"\nGame :"+game.getName()+
				"\nDiscounted price:"+(game.getPrice()-campaign.getDiscount()));
	}

	@Override
	public void UptadeCampaignSell(Campaign campaign, UserBase user, Game game) {
		
		System.out.println("Uptade the CampaignSell"+"Campaign :"+campaign.getCampaignName()+"\nUser :"+user.getFirstName()+"\nGame :"+game.getName());
	}

	@Override
	public void DeleteCampaignSell(Campaign campaign, UserBase user, Game game) {
		System.out.println("Deleted the CampaignSell"+"Campaign :"+campaign.getCampaignName()+"\nUser :"+user.getFirstName()+"\nGame :"+game.getName());
		
	}

}
