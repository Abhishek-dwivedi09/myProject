package com.myproject.candidateapi.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class CandidateDetails {

	@Id
	@GeneratedValue
	private int id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	private AddressModel address;
	
	private String firstName;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="candidate_id")
	private List<EducationDetails>educationDetails = new ArrayList<>();
	
	private String middleName;
	
	private String lastName;
	
	
	@Column(name="fathers_name")
	private String fatherName;
	
	@Column(name="mothers_name")
	private String motherName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AddressModel getAddress() {
		return address;
	}

	public void setAddress(AddressModel address) {
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public List<EducationDetails> getEducationDetails() {
		return educationDetails;
	}

	public void setEducationDetails(List<EducationDetails> educationDetails) {
		this.educationDetails = educationDetails;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public CandidateDetails(int id, AddressModel address, String firstName, List<EducationDetails> educationDetails,
			String middleName, String lastName, String fatherName, String motherName) {
		super();
		this.id = id;
		this.address = address;
		this.firstName = firstName;
		this.educationDetails = educationDetails;
		this.middleName = middleName;
		this.lastName = lastName;
		this.fatherName = fatherName;
		this.motherName = motherName;
	}

	public CandidateDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
