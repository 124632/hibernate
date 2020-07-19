package com.sus.sushma.Hibernate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="music_table")

public class MusicInstrumentDTO  implements Serializable{

	@Id
	@Column(name="music_id")
	private int musicId;
	@Column(name="music_name")
	private String name;
	@Column(name="music_cost")
	private double cost;
	@Column(name="music_type")
	private String type;
	
	
	public MusicInstrumentDTO() {
		System.out.println(this.getClass().getSimpleName()+"created");
		// TODO Auto-generated constructor stub
	}
	public int getMusicId() {
		return musicId;
	}
	public void setMusicId(int musicId) {
		this.musicId = musicId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
