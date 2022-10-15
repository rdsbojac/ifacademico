package com.projeto.ifacademico.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.ifacademico.entities.Admin;
import com.projeto.ifacademico.entities.Secretaria;
import com.projeto.ifacademico.repositories.AdminRepository;
import com.projeto.ifacademico.repositories.SecretariaRepository;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminRepository adminRepository;
	
	@Autowired
	SecretariaRepository secretariaRepository;
	
	
	@GetMapping()
	public List<Admin> findAllAdmin(){
		List<Admin> resultado = adminRepository.findAll();
		return resultado;
	}
	
	@GetMapping("/secretaria")
	public List<Secretaria> findAllSec(){
		List<Secretaria> resultado = secretariaRepository.findAll();
		return resultado;
	}
	
	@PostMapping("/secretaria/addsecretaria") /*Requisição do tipo POST*/
	public Secretaria insert(@RequestBody Secretaria secretaria) { /*Metodo envia o corpo do objeto */
		Secretaria resultado = secretariaRepository.save(secretaria);
		return resultado;
	}
	
	@DeleteMapping("/secretaria/deletesecretaria/{id}")/*Indicação do caminho /professor/id*/
	public void deleteSecretaria(@PathVariable Long id){ /*Annotation que indica que o id passado no getMaaping é o argumento desse metodo*/
		secretariaRepository.deleteById(id);
		System.out.print("Funcionario deletado com sucesso");
	}
	

}
