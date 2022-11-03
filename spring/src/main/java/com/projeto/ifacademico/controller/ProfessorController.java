package com.projeto.ifacademico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.projeto.ifacademico.entities.Professor;
import com.projeto.ifacademico.repositories.ProfessorRepository;

@RestController
@CrossOrigin("http://127.0.0.1:5137") // Colocar URL usada pelo Front-end 5137 é a porta
									// da extensão Live Server do VScode.
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
	
	
	
}
