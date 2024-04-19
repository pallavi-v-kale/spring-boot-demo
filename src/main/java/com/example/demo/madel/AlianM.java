package com.example.demo.madel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alian")
public class AlianM 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "alian_id")
	int aid;
	@Column(name = "alian_name")
	String anm;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnm() {
		return anm;
	}
	public void setAnm(String anm) {
		this.anm = anm;
	}

}
