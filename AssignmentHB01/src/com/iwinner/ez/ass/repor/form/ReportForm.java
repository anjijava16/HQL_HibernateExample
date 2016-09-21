package com.iwinner.ez.ass.repor.form;

public class ReportForm {

	private String id;
	private String empSal;
	private String empDesg;
	private String empDesc;
	private String empPhone;
	private String empLoc;
	private String empName;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmpSal() {
		return empSal;
	}
	public void setEmpSal(String empSal) {
		this.empSal = empSal;
	}
	public String getEmpDesg() {
		return empDesg;
	}
	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}
	public String getEmpDesc() {
		return empDesc;
	}
	public void setEmpDesc(String empDesc) {
		this.empDesc = empDesc;
	}
	public String getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}
	public String getEmpLoc() {
		return empLoc;
	}
	public void setEmpLoc(String empLoc) {
		this.empLoc = empLoc;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "ReportForm [id=" + id + ", empSal=" + empSal + ", empDesg="
				+ empDesg + ", empDesc=" + empDesc + ", empPhone=" + empPhone
				+ ", empLoc=" + empLoc + ", empName=" + empName + "]";
	}
	
	
	
}
