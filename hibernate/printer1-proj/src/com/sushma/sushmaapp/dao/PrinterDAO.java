package com.sushma.sushmaapp.dao;

import com.sushma.sushmaapp.dto.PrinterDTO;

public interface PrinterDAO {
	public void savePrinter(PrinterDTO printerDTO);
	
	public PrinterDTO getPrinterById(int id);
	
	public String getColorByName(String name);
	
	public Object[]getColorAndPriceById(int id);
}
