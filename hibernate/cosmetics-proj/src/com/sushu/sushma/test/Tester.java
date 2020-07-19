package com.sushu.sushma.test;

import com.sushu.sushma.dao.CosmeticsDAO;
import com.sushu.sushma.dao.CosmeticsDAOImpl;
import com.sushu.sushma.dto.CosmeticsDTO;

public class Tester {
	public static void main(String[] args) {
		CosmeticsDTO dto= new CosmeticsDTO();
		dto.setCosmeticsColor("black");
		dto.setCosmeticsId(4);
		dto.setCosmeticsName("debelle");
		dto.setCosmeticsPrice(170.00);
		
		CosmeticsDAO cosmeticsDAO= new CosmeticsDAOImpl();
		//cosmeticsDAO.saveCosmetics(dto);
		//CosmeticsDTO cosmeticsDTO=cosmeticsDAO.geCosmeticsById(1);
		//cosmeticsDAO.getColorByName("lakme");
		Object[] objects=cosmeticsDAO.getColorAndPriceById(2);
		for(Object object:objects) {
			System.out.println(object);
		}
		
	}

}
