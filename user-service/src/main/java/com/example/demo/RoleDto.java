package com.example.demo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RoleDto {
	private Long id;
	private String roleName;
	private String roleGrade;
	private String roleSkill;
	private String roleSalary;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleGrade() {
		return roleGrade;
	}
	public void setRoleGrade(String roleGrade) {
		this.roleGrade = roleGrade;
	}
	public String getRoleSkill() {
		return roleSkill;
	}
	public void setRoleSkill(String roleSkill) {
		this.roleSkill = roleSkill;
	}
	public String getRoleSalary() {
		return roleSalary;
	}
	public void setRoleSalary(String roleSalary) {
		this.roleSalary = roleSalary;
	}
	public RoleDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
