package DTOS;

import Entities.Match;

/*
 * DTO for the User Object. Assume that all entries have relevant getters/setters. Included an overloaded constructor for setting DTO with Database object. 
 */

public class MatchDto {
	
	public String id; 
	public UserDto player1;
	public UserDto player2;
	public String score; 
	public String winner; 
	
	
	public MatchDto (Match match) {
		
		this.id = match.getId(); 
		this.player1 = new UserDto(match.getPlayer1());
		this.player2 = new UserDto(match.getPlayer2());
		this.score = match.getScore();
		this.winner = match.getWinner(); 
	}
}
