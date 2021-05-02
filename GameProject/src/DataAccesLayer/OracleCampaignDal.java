package DataAccesLayer;

import Abstract.ICampaignDal;
import Entities.Campaign;

public class OracleCampaignDal implements ICampaignDal {

	@Override
	public void Add(Campaign campaign) {
		
		System.out.println("The campaign Added to Oracle database:"+campaign.getCampaignName());
	}

	@Override
	public void Uptade(Campaign campaign) {
		
		System.out.println("The campaign Uptaded to Oracle database:"+campaign.getCampaignName());
	}

	@Override
	public void Delete(Campaign campaign) {
		
		System.out.println("The campaign Deleted to Oracle database:"+campaign.getCampaignName());
	}

}
