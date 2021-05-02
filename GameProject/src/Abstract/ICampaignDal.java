package Abstract;

import Entities.Campaign;


public interface ICampaignDal {
	void Add(Campaign campaign);
    void Uptade(Campaign campaign);
    void Delete(Campaign campaign);
}

