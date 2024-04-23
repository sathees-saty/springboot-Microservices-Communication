package com.example.demo;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
@AllArgsConstructor
public class UserController {

	@Autowired UserRepository ob;
	

	
    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user){
        //User savedUser = userService.saveUser(user);
        User savedUser = ob.save(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseDto> getUser(@PathVariable("id") Long userId){
    	MicroserviceImpl microserviceImpl = new MicroserviceImpl();
    	User user = ob.findById(userId).get();
    	//User user = ob.getById(userId);
    	UserDto userDto = microserviceImpl.mapToUserDto(user);
    	DepartmentDto departmentDto = microserviceImpl.mapToDepartmentDto(user);
    	RoleDto roleDto = microserviceImpl.mapToRoleDto(user);
        
    	return ResponseEntity.ok(microserviceImpl.mapToResponseDto(userDto, departmentDto, roleDto));
    }
    
}

