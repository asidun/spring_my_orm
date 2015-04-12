package com.asidun.app.orm.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Person")
public class Person {

	//local code review (vtegza): lets do not forget what we learned on junior course.. keep encapsulation in place @ 12.04.15
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	String id;
	@NotEmpty(message="Name is mandatory")
	String userName;
	@NotEmpty(message="Address is mandatory")
	String address;	
	String youLikeNewsletter;
	String sex;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getYouLikeNewsletter() {
		return youLikeNewsletter;
	}
	public void setYouLikeNewsletter(String youLikeNewsletter) {
		this.youLikeNewsletter = youLikeNewsletter;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
