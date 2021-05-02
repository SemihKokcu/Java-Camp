package Main;
import Adapters.UserCheckManager;
import Concrete.CampaignManager;
import Concrete.CampaignSellManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SellManager;
import DataAccesLayer.MySqlCampaignDal;
import DataAccesLayer.MySqlCampaignSellDal;
import DataAccesLayer.MySqlGameDal;
import DataAccesLayer.MySqlSellDal;
import DataAccesLayer.OracleUserDal;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Entities.Sell;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer = new Gamer(1,"31531227352","Semih","kökçü",2000,1,"Call Of Duty");
        GamerManager gamerManager = new GamerManager(new UserCheckManager(),new OracleUserDal());
        gamerManager.Uptade(gamer);
       
        System.out.println("\n");
        
        Game game = new Game(1, "Call Of Duty", "Last version",100);
        GameManager gameManager = new GameManager(new MySqlGameDal());
        gameManager.Add(game);
        
        System.out.println("\n");
        
        Sell sell = new Sell(1, "Bursa ", "2314524");
        SellManager sellManager = new SellManager(new UserCheckManager(), new MySqlSellDal());
        sellManager.sellAdd(sell, game, gamer);
        
        System.out.println("\n");
        
        Campaign campaign = new Campaign(1, "YýlBasi", 20);
        CampaignManager campaignManager = new CampaignManager(new MySqlCampaignDal());
        campaignManager.Add(campaign);
        
        System.out.println("\n");
        
        CampaignSellManager campaignSellManager = new CampaignSellManager(new MySqlCampaignSellDal());
        campaignSellManager.AddCampaignSell(campaign, gamer, game);
        
        
	}

}
