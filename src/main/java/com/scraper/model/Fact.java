package com.scraper.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "random_fact")
public class Fact {

	@Id
	@Column(name = "random_fact_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "fact_used")
	private Boolean factUsed;

	@Column(name = "zach_fact")
	private String zachFact;

	public Fact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fact(int id, Boolean factUsed, String zachFact) {
		super();
		this.id = id;
		this.factUsed = factUsed;
		this.zachFact = zachFact;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Boolean getFactUsed() {
		return factUsed;
	}

	public void setFactUsed(Boolean factUsed) {
		this.factUsed = factUsed;
	}

	public String getZachFact() {
		return zachFact;
	}

	public void setZachFact(String zachFact) {
		this.zachFact = zachFact;
	}
	
}

