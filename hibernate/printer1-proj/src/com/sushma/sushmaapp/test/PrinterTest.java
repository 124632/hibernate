package com.sushma.sushmaapp.test;

import com.sushma.sushmaapp.dao.PrinterDAO;
import com.sushma.sushmaapp.dao.PrinterDAOImpl;
import com.sushma.sushmaapp.dto.PrinterDTO;

public class PrinterTest {
	public static void main(String[] args) {
		PrinterDTO printerDTO=new PrinterDTO();
		printerDTO.setPrinterId(5);
		printerDTO.setPrinterType("ink-jet");
		printerDTO.setPrinterColor("grey");
		printerDTO.setPrinterPrice(20000.00);
		printerDTO.setPrinterName("epsone");
		
		PrinterDAO printerDAO=new PrinterDAOImpl();
		//printerDAO.savePrinter(printerDTO);
		//PrinterDTO printerDTO1=  printerDAO.getPrinterById(1);
		 //String printerdto= printerDAO.getColorByName("sony");
		Object[] objects = printerDAO.getColorAndPriceById(1);
		for(Object object:objects) {
			System.out.print(object);
		}
	}
	
}
