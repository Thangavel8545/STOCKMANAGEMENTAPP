package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AccEntity;
import com.example.demo.model.Usermodel;
import com.example.demo.repository.AccRepo;
import com.example.demo.repository.UserRepos;

import jakarta.transaction.Transactional;
@Service
public class Userservice {

	@Autowired
	UserRepos ur;
	@Autowired
	AccRepo ae;
	
	
	public List<Usermodel> savedetail(List<Usermodel> um) {
		// TODO Auto-generated method stub
		return ur.saveAll(um);
	}
	public String deletebyname(int name) {
		// TODO Auto-generated method stub
		return ur.deletename(name)+"delete";
	}
	
	 @Transactional
	 public void fillbillno() {
		 List<Usermodel> he=ur.findAll();
		 List<AccEntity> je=ae.findAll();
		 for(Usermodel h:he) {
			 for(AccEntity job:je) {
				 if(offersmatch(job.getBillno(),h.getBillno())) {
					 h.setCustid(job.getCustid());;
					 break;
				 }
			 }
		 }
	 }
	 private boolean offersmatch(int description,int bill) {
		 if(description==bill) {
			 return true;
		 }
		 return false;
	 }

}
