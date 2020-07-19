package com.sushma.sushmaapp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="printer_table")
public class PrinterDTO implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="printer_id")
	private int printerId;
	@Column(name="printer_name")
	private String printerName;
	@Column(name="printer_type")
	private String printerType;
	@Column(name="printer_color")
	private String printerColor;
	@Column(name="printer_price")
	private double printerPrice;
	
	public PrinterDTO() {
		System.out.println(this.getClass().getSimpleName()+"is created");
	}
	
	public int getPrinterId() {
		return printerId;
	}

	public void setPrinterId(int printerId) {
		this.printerId = printerId;
	}

	public String getPrinterName() {
		return printerName;
	}

	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}

	public String getPrinterType() {
		return printerType;
	}

	public void setPrinterType(String printerType) {
		this.printerType = printerType;
	}

	public String getPrinterColor() {
		return printerColor;
	}

	public void setPrinterColor(String printerColor) {
		this.printerColor = printerColor;
	}

	public double getPrinterPrice() {
		return printerPrice;
	}

	public void setPrinterPrice(double printerPrice) {
		this.printerPrice = printerPrice;
	}

	@Override
	public String toString() {
		return "PrinterDTO [printerId=" + printerId + ", printerName=" + printerName + ", printerType=" + printerType
				+ ", printerColor=" + printerColor + ", printerPrice=" + printerPrice + "]";
	}

	
	
}
