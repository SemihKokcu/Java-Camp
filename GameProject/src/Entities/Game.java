package Entities;

import Abstract.IEntity;

public class Game implements IEntity {
	
	private int id;
	private String name;
	private String detail;
	private double price;
	
	public Game(int id, String name, String detail,double price) {
		
		this.id = id;
		this.name = name;
		this.detail = detail;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	};
	

}
