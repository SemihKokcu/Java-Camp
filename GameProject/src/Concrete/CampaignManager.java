package Concrete;

import Abstract.BaseCampaignManager;
import Abstract.ICampaignDal;
import Entities.Campaign;

public class CampaignManager extends BaseCampaignManager {

	private ICampaignDal campaignDal;
	
	public CampaignManager(ICampaignDal campaignDal) {
		
		this.campaignDal = campaignDal;
	}

	@Override
	public void Add(Campaign campaign) {
		super.Add(campaign);
		campaignDal.Add(campaign);
	}

	@Override
	public void Uptade(Campaign campaign) {
		super.Uptade(campaign);
		campaignDal.Uptade(campaign);
	}

	@Override
	public void Delete(Campaign campaign) {
		super.Delete(campaign);
		campaignDal.Delete(campaign);
		
	}
}
