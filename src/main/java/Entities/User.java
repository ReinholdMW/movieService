package Entities;

public class User {
	private String id; 
	private String userName;
	private String password;
	private Integer wins;
	private Integer losses;
	
	public String getId() {
		return this.id;
	}
	public String getUserName() {
		return this.userName;
	}
	
	2
	public String getPassword() {
		return this.password;
	}
	
	public Integer getWins() {
		return this.wins;
	}
	
	public Integer getLosses() {
		return this.losses;
	} 
}