package com.iwinner.hibernate.annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Test_TBL")
public class TestEntity {

	@Id
	private Integer id;

	@Column(name="LONG_ID")
	private Long longId;

	@Column(name="SAL_TEST")
	private Float salId;

	@Column(name="CH_ID")
	private Character ch;

	@Column(name="EMP_NAME")
	private String empName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getLongId() {
		return longId;
	}

	public void setLongId(Long longId) {
		this.longId = longId;
	}

	public Float getSalId() {
		return salId;
	}

	public void setSalId(Float salId) {
		this.salId = salId;
	}

	public Character getCh() {
		return ch;
	}

	public void setCh(Character ch) {
		this.ch = ch;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
