package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AccEntity;

import com.example.demo.service.AccService;

@CrossOrigin
@RestController
public class AccController {
  
	@Autowired
	AccService sser;
	
	@PostMapping("addbill")
	public AccEntity add(@RequestBody AccEntity ss)
	{
		return sser.saveInfo(ss);
	}
	@PostMapping("addmul")
	public List<AccEntity> addndetails(@RequestBody List<AccEntity> ss)
	{
		return sser.savedetails(ss);
	}
	@GetMapping("showbill")
	public List<AccEntity> show()
	{
		return sser.showInfo();
	}
	@PutMapping("update")
	public AccEntity modify(@RequestBody AccEntity ss)
	{
		return sser.changeInfo(ss);
	}
	
	
	@DeleteMapping("deletedetail")
	public String del(@RequestBody AccEntity ss)
	{
		sser.deleteInfo(ss);
		return "DELETED SUCCESSFULLY";
	}
	
	@DeleteMapping("delid/{custid}")
	public String deletemyid(@PathVariable int custid)
	{
		sser.deleteid(custid);
		return "deleted cust id";
	}
	
	@DeleteMapping("delparamid")
	public String deleteparamid(@RequestParam int custid)
	{
		sser.deleteid(custid);
		return "deleted parameter id";
	}
	@GetMapping("showbyId/{id}")
	public Optional<AccEntity> showid(@PathVariable int id)
	{
		return sser.showbyid(id);
	}
	
	@PutMapping("updateinfo/{id}")
	public String updateInfoById(@PathVariable int id,@RequestBody AccEntity ss)
	{
		return sser.updateinfoById(id, ss);
	}
	
	@GetMapping("sort/{str}")
	public List<AccEntity> sort(@PathVariable String str)
	{
		return sser.sort(str);
	}
	
	@GetMapping("paging/{cur}/{tot}")
	public List<AccEntity> paging(@PathVariable int cur,@PathVariable int tot)
	{
		return sser.paging(cur, tot);
	}
	
	@GetMapping("pageandsort/{cur}/{tot}/{str}")
	public List<AccEntity> pageandsort(@PathVariable int cur,@PathVariable int tot,@PathVariable String str)
	{
		return sser.pageandsort(cur, tot, str);
	}
	@DeleteMapping("deletequery/{amt}")
	public String delbilldetails(@PathVariable String amt)
	{
		return sser.delbill(amt)+"deleted";
	}
	@GetMapping("showquery/{custid}")
	public List<AccEntity> showbilldetails(@PathVariable int custid)
	{
		return sser.getbill(custid);
	}
	
	@PutMapping("updatequery/{newbuyer}/{oldbuyer}")
	public String updatebilldetails(@PathVariable String newbuyer,@PathVariable String oldbuyer)
	{
		return sser.updatebill(newbuyer, oldbuyer)+"updated";
	}
	@DeleteMapping("deleter/{id}")
	public String deleter(@PathVariable int id) {
		return sser.deletebybank(id);
	}
	
}
