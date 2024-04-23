package com.example.demo;

import lombok.AllArgsConstructor;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/departments")
@AllArgsConstructor
public class DepartmentController {

//    private DepartmentService departmentService;
	@Autowired DepartmentRepository ob;
    @PostMapping
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department){
        Department savedDepartment = ob.save(department);
        return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Optional<Department>> getDepartmentById(@PathVariable("id") Long departmentId){
        Optional<Department> department = ob.findById(departmentId);
        return ResponseEntity.ok(department);
    }
}