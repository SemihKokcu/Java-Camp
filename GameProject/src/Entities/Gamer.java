package Entities;



import Abstract.IEntity;

public class Gamer extends UserBase implements IEntity {
	
	private int gamerId;
	private String bestGame;
	
	public Gamer(int id, String identityNumber, String firstName, String lastName, int dateOfBirth,int gamerId,String bestGame) {
		super(id, identityNumber, firstName, lastName, dateOfBirth);
		this.gamerId  = gamerId;
		this.bestGame = bestGame;
		
	}
	
	public int getGamerId() {
		return gamerId;
	}
	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}
	public String getBestGame() {
		return bestGame;
	}
	public void setBestGame(String bestGame) {
		this.bestGame = bestGame;
	}
	
}
