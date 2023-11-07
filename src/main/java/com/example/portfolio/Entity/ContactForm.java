package com.example.portfolio.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class ContactForm {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String fullName;
	private String email;
	private String phoneNumber;
	private String emailSubject;
	private String massage;
	
	
	public ContactForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public ContactForm(Long id, String fullName, String email, String phoneNumber, String emailSubject,
			String massage) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.emailSubject = emailSubject;
		this.massage = massage;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmailSubject() {
		return emailSubject;
	}


	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}


	public String getMassage() {
		return massage;
	}


	public void setMassage(String massage) {
		this.massage = massage;
	}


	@Override
	public String toString() {
		return "ContactForm [id=" + id + ", fullName=" + fullName + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", emailSubject=" + emailSubject + ", massage=" + massage + "]";
	}
	
	
	
	
}
