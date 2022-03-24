package com.coderulagam.movies.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movies")
public class Movie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String descrption;
	
	private String  actor;



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescrption() {
		return descrption;
	}

	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

}
