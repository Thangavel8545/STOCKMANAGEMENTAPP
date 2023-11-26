package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SignupEntity;

import com.example.demo.service.SignupService;

@RestController
@CrossOrigin
public class SignupController {
 
	@Autowired
	SignupService sser;
	@PostMapping("adduser")
	public SignupEntity add(@RequestBody SignupEntity ss)
	{
		return sser.saveInfo(ss);
	}
	@GetMapping("showuser")
	public List<SignupEntity> show()
	{
		return sser.showInfo();
	}
}
