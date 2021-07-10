package DTOS;

import Entities.User;

/*
 * DTO for the User Object. Assume that all entries have relevant getters/setters. Included an overloaded constructor for setting DTO with Database object. 
 */

public class UserDto {

	public String id; 
	public String userName;
	public String password;
	public Integer wins;
	public Integer losses; 
	
	public UserDto(User user){
		this.id= user.getId();
		this.userName = user.getUserName();
		this.password = user.getPassword(); 
		this.wins = user.getWins();
		this.losses = user.getLosses(); 
	}
}
