package com.app.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="medication")
public class Medication extends BaseEntity {
	
	@Column(length=30)
	private String medicineName;
	
//	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
//	private LocalDateTime Date;
	
	@Column(name="doses")
	private int dose;
	
	@ManyToOne
	@JoinColumn(name="diseases_id")
	private Disease selectedDisease;
	
//	@ManyToOne
//	@JoinColumn(name="medicine_id")
//	private DateAndTime selectedMedicine;
//	
	public String getMedicineName() {
		return medicineName;
	}


	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}


	public int getDose() {
		return dose;
	}


	public void setDose(int dose) {
		this.dose = dose;
	}


	public Medication() {
		
	}


	public Medication(String medicineName, int dose) {
		super();
		this.medicineName = medicineName;
		this.dose = dose;
	}
	
	
	
	
	

}