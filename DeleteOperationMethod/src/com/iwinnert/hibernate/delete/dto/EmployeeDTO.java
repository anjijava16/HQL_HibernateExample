package com.iwinnert.hibernate.delete.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_DET_TBL")
public class EmployeeDTO {

	@Id
	private Integer id;

	@Column
	private String empName;

	@Column
	private String empEmail;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", empName=" + empName + ", empEmail="
				+ empEmail + "]";
	}

	
}
