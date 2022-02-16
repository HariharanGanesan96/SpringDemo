package com.chainsys.pet.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="pet_details")
public class PetDetailsEntity {
	
	@Id
	@Column(name = "PET_ID")
    @GeneratedValue
	private int petId;
	
	@Column(name = "PET_TYPE")
	private String petType;
	
	@Column(name = "PET_NAME")
	private String petName;
	
	@Column(name = "PET_GENDER")
	private String petGender;
	
	@Column(name = "PET_DOB")
	private Date petDob;
	
	@Column(name = "PET_QTY")
	private int petQty;
	
	@Column(name = "PET_DESCRIPTION")
	private String description;
	
	@Column(name = "PET_COLOR")
	private String petColor;
	
	@Column(name = "PET_PRICE")
	private double petprice;
	
	@Column(name = "PET_IMAGE")
	private String petImage;
	
	@Column(name = "STATUS")
	private String status;
		
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "CUSTOMER_ID")
	@PrimaryKeyJoinColumn
	private CustomersEntity customer;
	
	

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ADMIN_ID",referencedColumnName = "ADMIN_ID")
	@PrimaryKeyJoinColumn
	private AdminEntity admin;
	
	@Column(name = "PET_REGISTERDATE")
	private Date regDate;
	
	@Column(name = "AVAILABLE_QTY")
	private int avilableQty;

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getPetGender() {
		return petGender;
	}

	public void setPetGender(String petGender) {
		this.petGender = petGender;
	}

	public Date getPetDob() {
		return petDob;
	}

	public void setPetDob(Date petDob) {
		this.petDob = petDob;
	}

	public int getPetQty() {
		return petQty;
	}

	public void setPetQty(int petQty) {
		this.petQty = petQty;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPetColor() {
		return petColor;
	}

	public void setPetColor(String petColor) {
		this.petColor = petColor;
	}

	public double getPetprice() {
		return petprice;
	}

	public void setPetprice(double petprice) {
		this.petprice = petprice;
	}

	public String getPetImage() {
		return petImage;
	}

	public void setPetImage(String petImage) {
		this.petImage = petImage;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public CustomersEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomersEntity customer) {
		this.customer = customer;
	}

	public AdminEntity getAdmin() {
		return admin;
	}

	public void setAdmin(AdminEntity admin) {
		this.admin = admin;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public int getAvilableQty() {
		return avilableQty;
	}

	public void setAvilableQty(int avilableQty) {
		this.avilableQty = avilableQty;
	}

	@Override
	public String toString() {
		return "PetDetails [petId=" + petId + ", petType=" + petType + ", petName=" + petName + ", petGender="
				+ petGender + ", petDob=" + petDob + ", petQty=" + petQty + ", description=" + description
				+ ", petColor=" + petColor + ", petprice=" + petprice + ", petImage=" + petImage + ", status=" + status
				+ ", customer=" + customer + ", admin=" + admin + ", regDate=" + regDate + ", avilableQty="
				+ avilableQty + "]";
	}

	public PetDetailsEntity() {
		super();
	}

	public PetDetailsEntity(int petId, String petType, String petName, String petGender, Date petDob, int petQty,
			String description, String petColor, double petprice, String petImage, int avilableQty,int customerId) {
		super();
		this.petId = petId;
		this.petType = petType;
		this.petName = petName;
		this.petGender = petGender;
		this.petDob = petDob;
		this.petQty = petQty;
		this.description = description;
		this.petColor = petColor;
		this.petprice = petprice;
		this.petImage = petImage;
		this.avilableQty = avilableQty;
		this.customer.setCustomerId(customerId);
	}

	

}
