package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.SignupEntity;
import com.example.demo.repository.SignupRepo;
@Service

public class SignupService {

	@Autowired
	SignupRepo sr;
	
	public SignupEntity saveInfo(SignupEntity ss)
	{
		return sr.save(ss);
	}
	public List<SignupEntity> showInfo()
	{
		return sr.findAll();
	}
}
