package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class MicroserviceImpl {

	public UserDto mapToUserDto(User user) {
		UserDto userDto = new UserDto();
		userDto.setId(user.getId());
		userDto.setFirstName(user.getFirstName());
		userDto.setLastName(user.getLastName());
		userDto.setEmail(user.getEmail());
		return userDto;
	}

	public DepartmentDto mapToDepartmentDto(User user) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<DepartmentDto> responseEntity = restTemplate
				.getForEntity("http://localhost:8081/api/departments/" + user.getDepartmentId(), DepartmentDto.class);
		DepartmentDto departmentDto = responseEntity.getBody();
		return departmentDto;

	}

	public RoleDto mapToRoleDto(User user) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<RoleDto> responseEntity = restTemplate
				.getForEntity("http://localhost:8082/api/roles/" + user.getRoleId(), RoleDto.class);
		RoleDto roleDto = responseEntity.getBody();
		return roleDto;

	}

	public ResponseDto mapToResponseDto(UserDto userDto, DepartmentDto departmentDto, RoleDto roleDto) {
		ResponseDto responseDto = new ResponseDto();
		responseDto.setDepartment(departmentDto);
		responseDto.setRole(roleDto);
		responseDto.setUser(userDto);
		return responseDto;
	}
}
