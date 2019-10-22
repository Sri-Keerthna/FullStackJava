package com.sri;

public class NewUser {

	private String name;
	private String gender;
	private String address;
	private int contactno;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getContactno() {
		return contactno;
	}
	public void setContactno(int contactno) {
		this.contactno = contactno;
	}
	@Override
	public String toString() {
		return "NewUser [name=" + name + ", gender=" + gender + ", address=" + address + ", contactno=" + contactno
				+ "]";
	}
	
	public NewUser(String name, String gender, String address, int contactno) {
		super();
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.contactno = contactno;
	}
	
	public NewUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
