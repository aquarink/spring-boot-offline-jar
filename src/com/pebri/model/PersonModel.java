package com.pebri.model;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.pebri.helper.IsValidHobby;

public class PersonModel {

	@Pattern(regexp="[^0-9]*")
	private String personName;
	
	@IsValidHobby
	private String personHobby;
	
	private Long personMobile;
	private Date personDOB;
	private ArrayList<String> personSkills;
	
	// ini bind ke Address.java di model
	private Address personAddress;

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonHobby() {
		return personHobby;
	}

	public void setPersonHobby(String personHobby) {
		this.personHobby = personHobby;
	}

	public Long getPersonMobile() {
		return personMobile;
	}

	public void setPersonMobile(Long personMobile) {
		this.personMobile = personMobile;
	}

	public Date getPersonDOB() {
		return personDOB;
	}

	public void setPersonDOB(Date personDOB) {
		this.personDOB = personDOB;
	}

	public ArrayList<String> getPersonSkills() {
		return personSkills;
	}

	public void setPersonSkills(ArrayList<String> personSkills) {
		this.personSkills = personSkills;
	}

	public Address getPersonAddress() {
		return personAddress;
	}

	public void setPersonAddress(Address personAddress) {
		this.personAddress = personAddress;
	}
	
	
}
