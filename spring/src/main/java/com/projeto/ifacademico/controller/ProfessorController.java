package com.projeto.ifacademico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projeto.ifacademico.entities.Professor;
import com.projeto.ifacademico.repositories.ProfessorRepository;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

	@Autowired
	private ProfessorRepository professorRepository;
	
	@GetMapping
	public List<Professor> findAll(){
		List<Professor> resultado = professorRepository.findAll();
		return resultado;
	}
	
	@GetMapping(value = "/{id}")/*Indicação do caminho /professor/id*/
	public Professor findById(@PathVariable Long id){ /*Annotation que indica que o id passado no getMaaping é o argumento desse metodo*/
		Professor resultado = professorRepository.findById(id).get();
		return resultado;
	}
	
	@PostMapping /*Requisição do tipo POST*/
	public Professor insert(@RequestBody Professor professor) { /*Metodo envia o corpo do objeto */
		Professor resultado = professorRepository.save(professor);
		return resultado;
	}
	
}
