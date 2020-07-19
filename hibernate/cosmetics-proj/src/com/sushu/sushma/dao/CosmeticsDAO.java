package com.sushu.sushma.dao;

import com.sushu.sushma.dto.CosmeticsDTO;

public interface CosmeticsDAO {
	
		public void saveCosmetics(CosmeticsDTO cosmeticsDTO);
		
		public CosmeticsDTO geCosmeticsById(int id);
		
		public String getColorByName(String name);
		
		public Object[] getColorAndPriceById(int id);
		

}
