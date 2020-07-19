package com.sus.sushma.Hibernate.test;

import com.sus.sushma.Hibernate.dao.AgriDAO;
import com.sus.sushma.Hibernate.dao.AgriDAOImpl;
import com.sus.sushma.Hibernate.dto.AgriDTO;

public class AgriTester {
	public static void main(String[] args) {
		
		AgriDTO dto= new AgriDTO();
		dto.setAgriId(3);
		dto.setDepartment("organic-farming");
		dto.setLocation("Davangere");
	    dto.setState("Karnataka");
	    
	    AgriDAO dao=new AgriDAOImpl();
	    dao.saveAgri(dto);
	    dao.getAgri(1);
	}
}
