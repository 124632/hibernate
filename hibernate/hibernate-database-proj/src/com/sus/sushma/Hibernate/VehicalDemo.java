package com.sus.sushma.Hibernate;

public class VehicalDemo {
	public static void main(String[] args) {
		Vehical vehical=new Vehical();
		vehical.setName("royal");
		vehical.setBrand("xyz");
		vehical.setPrice(10000);
		
		System.out.println("vehical-name:"+vehical.getName()+"vehical-brand:"+vehical.getBrand()+"vehical-price:"+vehical.getPrice());
	}

}
