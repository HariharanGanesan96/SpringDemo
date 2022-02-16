package com.chainsys.pet.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="customers")
public class CustomersEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CUSTOMER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	
	@Column(name = "CUSTOMER_FIRSTNAME")
	private String firstName;
	
	@Column(name = "CUSTOMER_LASTNAME")
	private String lastName;
	
	@Column(name = "CUSTOMER_USERNAME")
	private String userName;
	
	@Column(name = "CUSTOMER_PASSWORD")
	private String password;
	
	@Column(name = "CUSTOMER_EMAIL")
	private String email;
	
	@Column(name = "CUSTOMER_MOBILENUMBER")
	private long number;
	
	@Column(name = "CUSTOMER_WALLET")
	private double wallet;
	
	@Column(name = "CUSTOMER_REG_DATE")
	private Date regDate;
	
	@Column(name = "CUSTOMER_ADDRESS")
	private String address;
	
	@Column(name = "CUSTOMER_CITY")
	private String city;
	
	@Column(name = "CUSTOMER_PINCODE")
	private int pincode;
	
	@Column(name = "CUSTOMER_GENDER")
	private String gender;
	
	@Column(name = "CUSTOMER_IMAGE")
	private String image;
	
	@Column(name = "STATUS")
	private String staus;
		
	public String getStaus() {
		return staus;
	}

	public void setStaus(String staus) {
		this.staus = staus;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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

	public double getWallet() {
		return wallet;
	}

	public void setWallet(double wallet) {
		this.wallet = wallet;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
  
	
	

	@Override
	public String toString() {
		return "Customers [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", userName=" + userName + ", password=" + password + ", email=" + email + ", number=" + number
				+ ", wallet=" + wallet + ", regDate=" + regDate + ", address=" + address + ", city=" + city + ", pincode="
				+ pincode + ", gender=" + gender + ", image=" + image + "]";
	}

	public CustomersEntity() {
		super();
	}
		
	public CustomersEntity(int customerId, String firstName, String lastName, String gender, String userName, String password, String email,
			long number, double wallet, Date regDate, String address, int pincode, String image,String city,String status) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.number = number;
		this.wallet = wallet;
		this.regDate = regDate;
		this.address = address;
		this.pincode = pincode;
		this.gender = gender;
		this.image = image;
		this.city=city;
		this.staus=status;
	}	  
}
