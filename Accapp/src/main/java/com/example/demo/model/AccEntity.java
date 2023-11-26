package com.example.demo.model;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="billpro")

public class AccEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int custid;
	  private int billno;
	  private int amt;
	  private String buyer;
	  private String bank;
	  private String location;
	 
	  
      @OneToOne(cascade = CascadeType.ALL)
      @JoinColumn(name="fk_shipid")
	  private AuditEntity se;


	public AccEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AccEntity(int custid, int billno, int amt, String buyer, String bank, String location, AuditEntity se) {
		super();
		this.custid = custid;
		this.billno = billno;
		this.amt = amt;
		this.buyer = buyer;
		this.bank = bank;
		this.location = location;
		this.se = se;
	}


	public int getCustid() {
		return custid;
	}


	public void setCustid(int custid) {
		this.custid = custid;
	}


	public int getBillno() {
		return billno;
	}


	public void setBillno(int billno) {
		this.billno = billno;
	}


	public int getAmt() {
		return amt;
	}


	public void setAmt(int amt) {
		this.amt = amt;
	}


	public String getBuyer() {
		return buyer;
	}


	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}


	public String getBank() {
		return bank;
	}


	public void setBank(String bank) {
		this.bank = bank;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public AuditEntity getSe() {
		return se;
	}


	public void setSe(AuditEntity se) {
		this.se = se;
	}
      

	   
     // @OneToMany(cascade = CascadeType.ALL)
    //  @JoinColumn(name="custid")
     // private List<CommodityEntity> ce;




   
        

	
    
      
      

	  
	  
	
	
}