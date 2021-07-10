package controllers;

/*
 * Controller for handling users of the app. Has basic create, update and get functionality, but also fetches the leaderboard for the app itself 
 * 
 * 
 */

public class UserController {
	
	//Get call, takes in a ID, returns a Response containing  user dto., 
	Response getUser(String id) {
		
	}
	
	//Post call, takes in a UserDto, containing the filled out Username and Password, saves to the database,then returns the User dto with ID, wins and losses set.
	Response createUser(UserDto userDto) {
	}
	
	//Put call, we're keeping track of wins and losses via the User entity, thus we need some way to update them. Although this can also be leveraged for updating password if need be.
	Response updateUser(UserDto userDto) {
		
	}
	
	//Get call, fetches all users and returns a Set of them, ordered by Win to Loss ration. 
	Response fetchLeaderBoard() {
		
	}
}
