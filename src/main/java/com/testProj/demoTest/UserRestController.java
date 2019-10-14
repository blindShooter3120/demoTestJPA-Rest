package com.testProj.demoTest;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/Users")
public class UserRestController {

	@Autowired
	private UserServiceStub userServiceIns;
	
	@PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<UUID> createUser(@RequestBody UserCreateDTO userCreateDTO){
        return new ResponseEntity<>(userServiceIns.createUser(userCreateDTO), HttpStatus.CREATED);
    }
	
	 @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	    @ResponseStatus(HttpStatus.OK)
	    public ResponseEntity<UserFindDTO> updateUser(@PathVariable(value = "id") UUID id,
	                                                         @RequestBody UserUpdateDTO userUpdateDTO){
	        return new ResponseEntity<>(userServiceIns.updateUser(id, userUpdateDTO), HttpStatus.OK);
	    }
}


