package com.projeto.ifacademico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.ifacademico.entities.Admin;
import com.projeto.ifacademico.repositories.AdminRepository;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminRepository adminRepository;
	
	@GetMapping()
	public List<Admin> findAll(){
		List<Admin> resultado = adminRepository.findAll();
		return resultado;
	}
	
	
	
	

}
