package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Usermodel;
import com.example.demo.repository.UserRepos;
import com.example.demo.service.Userservice;

@RestController
public class Usercontroller {

	@Autowired 
	Userservice us;
	@Autowired
	UserRepos ur;
	@PostMapping("saveinfo")
	public List<Usermodel> saveinfo(@RequestBody List<Usermodel> um){
		return  us.savedetail(um);
	}
	@GetMapping("showinfo")
	public List<Usermodel> showinfo(){
		return ur.findAll();
	}
	@GetMapping("fillbillno")
	public String fill() {
		us.fillbillno();
		return "updated";
	}
	@DeleteMapping("deletebybill/{name}")
	public String saveinfo(@PathVariable int name) {
		return us.deletebyname(name);
	}
}
