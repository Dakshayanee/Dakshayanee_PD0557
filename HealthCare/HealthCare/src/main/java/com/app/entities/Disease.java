package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="disease")
public class Disease extends BaseEntity {
	
	@Column(length=30)
	private String diseaseName;
	
	@Column(length=100)
	private String diseaseDescription;

	public Disease(String diseaseName, String diseaseDescription) {
		super();
		this.diseaseName = diseaseName;
		this.diseaseDescription = diseaseDescription;
	}
	
	@OneToMany(mappedBy="selectedDisease",cascade=CascadeType.REMOVE,orphanRemoval = true)
	private List<Medication> medication = new ArrayList<>(); 
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	public Disease() {}

	public String getDiseaseName() {
		return diseaseName;
	}

	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

	public String getDiseaseDescription() {
		return diseaseDescription;
	}

	public void setDiseaseDescription(String diseaseDescription) {
		this.diseaseDescription = diseaseDescription;
	}
	

}
