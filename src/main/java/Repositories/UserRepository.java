package Repositories;

import Entities.User;

public class UserRepository {

	 private EntityManager manager;
	 
	 public UserRepositroy(EntityManager manager) {
		 this.manager = manager; 
	 }
	
	public User findById(String userId) {
		  User artist = manager.find(User.class, userId);
	        if (artist == null) {
	            throw new EntityNotFoundException("Can't find Artist for ID "
	                + userId);
	        }
	        return artist;	
	   }
	
	

}
