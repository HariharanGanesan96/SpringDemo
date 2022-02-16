package com.chainsys.pet.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin_details")
public class AdminEntity {
   
	@Id
	@Column(name ="ADMIN_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adminId;
	
	@Column(name ="ADMIN_FIRSTNAME")
    private String firstName;
	
	@Column(name ="ADMIN_LASTNAME")
    private String lastName;
	
	@Column(name ="ADMIN_USERNAME")
    private String userName;
	
	@Column(name ="ADMIN_PASSWORD")
    private String password;
	
	@Column(name ="ADMIN_EMAIL")
    private String email;
	
	@Column(name ="ADMIN_NUMBER")
    private long number;
	
	@Column(name ="ADMIN_REGISTERDATE")
    private Date registerDate;
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ",\n firstName=" + firstName + ",\n lastName=" + lastName + ",\n userName="
				+ userName + ",\n password=" + password + ",\n email=" + email + ",\n number=" + number + ",\n registerDate="
				+ registerDate + "]";
	}
	public AdminEntity() {
		super();
	}
	
	public AdminEntity(int adminId, String firstName, String lastName, String userName, String email,
			long number, Date registerDate) {
		super();
		this.adminId = adminId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.email = email;
		this.number = number;
		this.registerDate = registerDate;
	}
	
}
