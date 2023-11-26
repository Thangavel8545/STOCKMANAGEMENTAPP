package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usermodel {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int userid;
 private String username;
 private int billno;
 private int custid;
public Usermodel(int userid, String username, int billno, int custid) {
	super();
	this.userid = userid;
	this.username = username;
	this.billno = billno;
	this.custid = custid;
}
public Usermodel() {
	super();
	// TODO Auto-generated constructor stub
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public int getBillno() {
	return billno;
}
public void setBillno(int billno) {
	this.billno = billno;
}
public int getCustid() {
	return custid;
}
public void setCustid(int custid) {
	this.custid = custid;
}
 
}