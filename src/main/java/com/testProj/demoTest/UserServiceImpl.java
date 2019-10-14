package com.testProj.demoTest;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("userServiceStub")
public class UserServiceImpl implements UserServiceStub  {
	


	@Autowired
    private UserRepository userRepository;
	
	@Override
	public UUID createUser(UserCreateDTO userCreateDTO) {
		
		// TODO Auto-generated method stub
		User newUser= new User();
		
		newUser.setId(UUID.randomUUID());
		newUser.setFirstName(userCreateDTO.getUser_firstName());
		newUser.setLastname(userCreateDTO.getUser_lastname());
		newUser.setEmail(userCreateDTO.getUser_email());
		newUser.setDob(userCreateDTO.getUser_dob());
		newUser.setPassword(userCreateDTO.getUser_password());
		
		return userRepository.save(newUser).getId();
		
	}

	@Override
	public UserFindDTO updateUser(UUID id, UserUpdateDTO userUpdateDTO) {
		
		if (userRepository.findById(id).isPresent()){
            User currentUser = userRepository.findById(id).get();
            
            currentUser.setFirstName(userUpdateDTO.getFirstName());
            currentUser.setLastname(userUpdateDTO.getLastname());
            currentUser.setEmail(userUpdateDTO.getEmail());
            currentUser.setDob(userUpdateDTO.getDob());
            currentUser.setPassword(userUpdateDTO.getPassword());            
            User updatedUser = userRepository.save(currentUser);

            return new UserFindDTO(updatedUser.getId(), updatedUser.getFirstName(),
            		updatedUser.getLastname(),updatedUser.getEmail(),updatedUser.getDob(),updatedUser.getPassword());
        }
		
		else{
            return null;
        }
		
		
		
	}
	

}
