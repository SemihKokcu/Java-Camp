package Entities;

import Abstract.IEntity;

public class Sell implements IEntity {

	private int id;
	private String sellName;
	private String sellNumber;
	
	public Sell(int id, String sellName,String sellNumber) {
		super();
		this.id = id;
		this.sellName = sellName;
		this.sellNumber = sellNumber;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSellName() {
		return sellName;
	}
	public void setSellName(String sellName) {
		this.sellName = sellName;
	}

	public String getSellNumber() {
		return sellNumber;
	}

	public void setSellNumber(String sellNumber) {
		this.sellNumber = sellNumber;
	}
	
}
