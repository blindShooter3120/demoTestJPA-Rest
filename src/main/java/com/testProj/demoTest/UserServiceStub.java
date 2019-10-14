package com.testProj.demoTest;

import java.util.UUID;

public interface UserServiceStub {

	public UUID createUser(UserCreateDTO userCreateDTO);
	public UserFindDTO updateUser(UUID id, UserUpdateDTO vehicleUpdateDTO);
	
}
