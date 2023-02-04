package edu.institute.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity  // to denote it as a Entity class
public class Student {
	@Id   // to make this field as a PK
	private int sid;
	private String name;
	private String email;
	private String contact;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
}
