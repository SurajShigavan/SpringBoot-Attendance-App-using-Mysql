package com.example.loginapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.Calendar;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Timings {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String Date;
	String Signtime;
	String Singoutime;
	
	@ManyToOne
	
	@JoinColumn(name="userid")
	@JsonBackReference
	UserMaster user;

	public Timings(int id, String date, String signtime, String singoutime, UserMaster user) {
		super();
		this.id = id;
		Date = date;
		Signtime = signtime;
		Singoutime = singoutime;
		this.user = user;
	}

	public Timings() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getSigntime() {
		return Signtime;
	}

	public void setSigntime(String signtime) {
		Signtime = signtime;
	}

	public String getSingoutime() {
		return Singoutime;
	}

	public void setSingoutime(String singoutime) {
		Singoutime = singoutime;
	}

	public UserMaster getUser() {
		return user;
	}

	public void setUser(UserMaster user) {
		this.user = user;
	} 

	@Override
	public String toString() {
		return "Timings [ Date=" + Date + ", Signtime=" + Signtime + ", Singoutime=" + Singoutime+"]";
	}

	
	
}
