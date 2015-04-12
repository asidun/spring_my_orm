package com.asidun.app.entity;

//local code review (vtegza):  no need in this model @ 12.04.15
public class NewsletterQue {

	//local code review (vtegza): should be private, this is broken OOP @ 12.04.15
	String userName;
	String address;	
	String youLikeNewsletter;
	String sex;
	
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
