package com.iwinner.ez.ass.repor.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Report_TBL")
public class ReportDTO {

	@Id
	private Integer id;

	@Column
	private Float empSal;

	@Column
	private String empDesg;

	@Column
	private String empAdd;

	@Column
	private String empDes;

	@Column
	private Long empPhoneNumber;

	@Column
	private String empName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Float empSal) {
		this.empSal = empSal;
	}

	public String getEmpDesg() {
		return empDesg;
	}

	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}

	public String getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}


	public String getEmpDes() {
		return empDes;
	}

	public void setEmpDes(String empDes) {
		this.empDes = empDes;
	}

	@Override
	public String toString() {
		return "ReportDTO [id=" + id + ", empSal=" + empSal + ", empDesg="
				+ empDesg + ", empAdd=" + empAdd + ", empDes=" + empDes
				+ ", empPhoneNumber=" + empPhoneNumber + ", empName=" + empName
				+ "]";
	}

	public Long getEmpPhoneNumber() {
		return empPhoneNumber;
	}

	public void setEmpPhoneNumber(Long empPhoneNumber) {
		this.empPhoneNumber = empPhoneNumber;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
