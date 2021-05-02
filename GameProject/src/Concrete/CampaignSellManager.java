package Concrete;

import Abstract.BaseCampaignSellManager;
import Abstract.ICampaignSellDal;
import Entities.Campaign;
import Entities.Game;
import Entities.UserBase;

public class CampaignSellManager extends BaseCampaignSellManager{
	
	private ICampaignSellDal campaignSellDal;
	public CampaignSellManager(ICampaignSellDal campaignSellDal) {
		
		this.campaignSellDal = campaignSellDal;
	}

	@Override
	public void AddCampaignSell(Campaign campaign, UserBase user, Game game) {
		
		super.AddCampaignSell(campaign, user, game);
		campaignSellDal.Add(campaign, user, game);
	}

	@Override
	public void UptadeCampaignSell(Campaign campaign, UserBase user, Game game) {
	
		super.UptadeCampaignSell(campaign, user, game);
		campaignSellDal.Uptade(campaign, user, game);
	}	

	@Override
	public void DeleteCampaignSell(Campaign campaign, UserBase user, Game game) {
		
		super.DeleteCampaignSell(campaign, user, game);
		campaignSellDal.Delete(campaign, user, game);
	}

}
