package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.AccEntity;
import com.example.demo.repository.AccRepo;

@Service
public class AccService {
    
	@Autowired
	AccRepo sr;
	
	public AccEntity saveInfo(AccEntity ss)
	{
		return sr.save(ss);
	}
	public List<AccEntity> savedetails(List<AccEntity> ss)
    {
    	return (List<AccEntity>)sr.saveAll(ss);
    }
	public List<AccEntity> showInfo()
	{
		return sr.findAll();
	}
	public AccEntity changeInfo(AccEntity ss)
    {
    	return sr.saveAndFlush(ss);
    }
    public void deleteInfo(AccEntity ss)
    {
    	sr.delete(ss);
    }
    public void deleteid(int custid)
    {
    	sr.deleteById(custid);
    }
    
    public Optional <AccEntity> showbyid(int id)
    {
      return sr.findById(id);	
    }
    
    public String updateinfoById(int id,AccEntity ss) {
    	sr.saveAndFlush(ss);
    	if(sr.existsById(id))
    	{
    		return "Updated";
    	}
    	else{
    		return "Enter the valid Id";
    	}
    }
    public List<AccEntity> sort(String str)
    {
    	return sr.findAll(Sort.by(str).descending());
    }
    
    public List<AccEntity> paging(int cur,int tot)
    {
    	Page<AccEntity> page=sr.findAll(PageRequest.of(cur,tot));
    	return page.getContent();
    	
    }
    
    public List<AccEntity> pageandsort(int cur,int tot,String str)
    {
    	Page<AccEntity> page=sr.findAll(PageRequest.of(cur,tot,Sort.by(str)));
    	return page.getContent();
    }
    public List<AccEntity> getbill(int custid)
    {
    	return sr.getBillInfo(custid);
    }
    public int delbill(String amt)
    {
    	return sr.deleteBillInfo(amt);
    }
    public int updatebill(String oldbuyer,String newbuyer )
    {
    	return sr.updateBillInfo(oldbuyer, newbuyer);
    }
	public String deletebybank(int id) {
		// TODO Auto-generated method stub
		return sr.deletebank(id)+"deleted";
	}
}
