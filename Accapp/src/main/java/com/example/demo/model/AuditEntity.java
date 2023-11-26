package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="AuditTable")
public class AuditEntity {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int shipid;
	private String shipper;
	private int taxper;
	private int deliverfee;
	private int gstno;
    private int month;
	public AuditEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AuditEntity(int shipid, String shipper, int taxper, int deliverfee, int gstno, int month) {
		super();
		this.shipid = shipid;
		this.shipper = shipper;
		this.taxper = taxper;
		this.deliverfee = deliverfee;
		this.gstno = gstno;
		this.month = month;
	}
	public int getShipid() {
		return shipid;
	}
	public void setShipid(int shipid) {
		this.shipid = shipid;
	}
	public String getShipper() {
		return shipper;
	}
	public void setShipper(String shipper) {
		this.shipper = shipper;
	}
	public int getTaxper() {
		return taxper;
	}
	public void setTaxper(int taxper) {
		this.taxper = taxper;
	}
	public int getDeliverfee() {
		return deliverfee;
	}
	public void setDeliverfee(int deliverfee) {
		this.deliverfee = deliverfee;
	}
	public int getGstno() {
		return gstno;
	}
	public void setGstno(int gstno) {
		this.gstno = gstno;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	

    
	
	
}
