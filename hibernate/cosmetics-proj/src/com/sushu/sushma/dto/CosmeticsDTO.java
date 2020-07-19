package com.sushu.sushma.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cosmetics_table")
public class CosmeticsDTO implements Serializable {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@Column(name = "cosmetics_id")
	private int cosmeticsId;
	@Column(name = "cosmetics_name")
	private String cosmeticsName;
	@Column(name = "cosmetics_price")
	private double cosmeticsPrice;
	@Column(name = "ssss")
	private String cosmeticsColor;
	
	public CosmeticsDTO() {
		System.out.println(this.getClass().getSimpleName()+"is created");
	}
	
	public int getCosmeticsId() {
		return cosmeticsId;
	}
	public void setCosmeticsId(int cosmeticsId) {
		this.cosmeticsId = cosmeticsId;
	}
	public String getCosmeticsName() {
		return cosmeticsName;
	}
	public void setCosmeticsName(String cosmeticsName) {
		this.cosmeticsName = cosmeticsName;
	}
	public double getCosmeticsPrice() {
		return cosmeticsPrice;
	}
	public void setCosmeticsPrice(double cosmeticsPrice) {
		this.cosmeticsPrice = cosmeticsPrice;
	}
	public String getCosmeticsColor() {
		return cosmeticsColor;
	}
	public void setCosmeticsColor(String cosmeticsColor) {
		this.cosmeticsColor = cosmeticsColor;
	}
	
	

}
