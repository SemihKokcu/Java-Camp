package Entities;

public class Campaign {
	private Game game;
	private int id;
	private String campaignName;
	private double discount;
	private double newPrice;
	
	public Campaign(int id, String campaignName, double discount) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discount = discount;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getNewPrice() {
		
		return  ((game.getPrice() - ((game.getPrice()*discount)/100)));
	}

}
