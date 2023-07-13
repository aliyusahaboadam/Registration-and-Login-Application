package customloginapplication.service;

import customloginapplication.dto.UserDto;
import customloginapplication.model.User;

public interface UserService {
	
	User findByUsername(String username);
	User save (UserDto userDto);

}
