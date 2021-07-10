package service;

import DTOS.UserDto;
import Repositories.UserRepository;

public class UserService {

	UserRepository userRepository = new UserRepository(); 
	
	UserDto getUser(String id) {
		return new UserDto(userRepository.getUserById(id));
		
	}
}
