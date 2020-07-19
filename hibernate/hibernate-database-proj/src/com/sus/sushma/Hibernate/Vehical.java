package com.sus.sushma.Hibernate;

import java.io.Serializable;

public class Vehical implements Serializable {
	private String name;
	private String brand;
	private double price;

	public Vehical() {
		System.out.println("default const...");
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
