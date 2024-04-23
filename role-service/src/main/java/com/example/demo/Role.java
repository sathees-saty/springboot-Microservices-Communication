package com.example.demo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "roles")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Role {

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", roleName=" + roleName + ", roleGrade=" + roleGrade + ", roleSkill=" + roleSkill
				+ ", roleSalary=" + roleSalary + "]";
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
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String roleName;
	private String roleGrade;
	private String roleSkill;
	private String roleSalary;
}
