package com.example.demo;

import lombok.AllArgsConstructor;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/roles")
@AllArgsConstructor

public class RoleController {

	@Autowired RoleRepository ob;
	
    @PostMapping
    public ResponseEntity<Role> saveRole(@RequestBody Role role){
    	Role savedRole = ob.save(role);
        return new ResponseEntity<>(savedRole, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Optional<Role>> getDepartmentById(@PathVariable("id") Long roleID){
        Optional<Role> role = ob.findById(roleID);
        return ResponseEntity.ok(role);
    }

}
