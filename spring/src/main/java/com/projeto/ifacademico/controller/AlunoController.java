package com.projeto.ifacademico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projeto.ifacademico.entities.Aluno;
import com.projeto.ifacademico.repositories.AlunoRepository;

@RestController
@RequestMapping(value = "/aluno")
public class AlunoController {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@GetMapping
	public List<Aluno>findAll(){
		List<Aluno> resultado = alunoRepository.findAll();
		return resultado;
	}
	
	@GetMapping(value = "/{id}")
	public Aluno findById(@PathVariable Long id) {
		Aluno resultado = alunoRepository.findById(id).get();
		return resultado;
		
	}
	

}
