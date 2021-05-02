package Abstract;

import Entities.Campaign;

public abstract class BaseCampaignManager implements ICampaignService {

	@Override
	public void Add(Campaign campaign) {
		System.out.println("Added the Campaign :"+campaign.getCampaignName());
		
	}

	@Override
	public void Uptade(Campaign campaign) {
		System.out.println("Added the Campaign :"+campaign.getCampaignName());
		
	}

	@Override
	public void Delete(Campaign campaign) {
		System.out.println("Added the Campaign :"+campaign.getCampaignName());
		
	}

}
