package Entities;

public class Match {

	
	//One to one relationship
	private User player1; 
	//One to one relationship
	private User player2; 
	private String id; 
	private String score; 
	private String winner; 
	
	public String getId() {
		return this.id;
	}

	public User getPlayer1() {
		return this.getPlayer1(); 
	}

	public User getPlayer2() {
		return this.getPlayer2();
	}

	public String getScore() {
		return this.score;
	}

	public String getWinner() {
		return this.winner;
	} 
	
}
