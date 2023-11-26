package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CommodityTable")
public class CommodityEntity {
  
	@Id
	private int salesid;
	private String type;
	private String cname;
	private String manufacturer;
	private String origin;
	private int quantity;
	private int stock;
	public CommodityEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CommodityEntity(int salesid, String type, String cname, String manufacturer, String origin, int quantity,
			int stock) {
		super();
		this.salesid = salesid;
		this.type = type;
		this.cname = cname;
		this.manufacturer = manufacturer;
		this.origin = origin;
		this.quantity = quantity;
		this.stock = stock;
	}
	public int getSalesid() {
		return salesid;
	}
	public void setSalesid(int salesid) {
		this.salesid = salesid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
