package com.myproject.candidateapi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class EducationDetails {

	@Id
	@GeneratedValue
  private int id;
	
	private String qualification;
	private String specialization;
	private String percentages;
	private String subjects;
	
	public int getId() {
		return id;
	}
	public EducationDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EducationDetails(int id, String qualification, String specialization, String percentages, String subjects) {
		super();
		this.id = id;
		this.qualification = qualification;
		this.specialization = specialization;
		this.percentages = percentages;
		this.subjects = subjects;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getPercentages() {
		return percentages;
	}
	public void setPercentages(String percentages) {
		this.percentages = percentages;
	}
	public String getSubjects() {
		return subjects;
	}
	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}
}
