package com.sus.sushma.Hibernate.test;

import com.sus.sushma.Hibernate.dao.MusicInstrumentDAO;
import com.sus.sushma.Hibernate.dao.MusicInstrumentDAOImpl;
import com.sus.sushma.Hibernate.dto.MusicInstrumentDTO;

public class Tester {
	public static void main(String[] args) {
		MusicInstrumentDTO dto= new MusicInstrumentDTO();
		dto.setMusicId(1);
		dto.setName("Guiter");
		dto.setCost(8000.00);
		dto.setType("Electric");
		
		
		MusicInstrumentDAO dao=new MusicInstrumentDAOImpl();
		dao.saveMusicInstrument(dto);
		}

}
