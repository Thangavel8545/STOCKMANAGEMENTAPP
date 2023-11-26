
package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Usermodel;

import jakarta.transaction.Transactional;

public interface UserRepos extends JpaRepository<Usermodel, Integer>{
  
	@Modifying
	@Transactional
	@Query(value = "delete from usermodel where custid=:name",nativeQuery = true)
	public  int deletename(int name);
}
