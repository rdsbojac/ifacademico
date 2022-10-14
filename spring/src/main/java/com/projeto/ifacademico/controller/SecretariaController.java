package com.projeto.ifacademico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.ifacademico.entities.Aluno;
import com.projeto.ifacademico.entities.Professor;
import com.projeto.ifacademico.entities.Secretaria;
import com.projeto.ifacademico.repositories.AlunoRepository;
import com.projeto.ifacademico.repositories.ProfessorRepository;
import com.projeto.ifacademico.repositories.SecretariaRepository;

@RestController
@RequestMapping("/secretaria")
public class SecretariaController {

	@Autowired
	SecretariaRepository secretariaRepository;
	@Autowired
	ProfessorRepository professorRepository;
	@Autowired
	AlunoRepository alunoRepository;
	
	
	@GetMapping()
	public List<Secretaria> findAll(){
		List<Secretaria> resultado = secretariaRepository.findAll();
		return resultado;
	}
	
	@PostMapping("/cadprof") /*Requisição do tipo POST*/
	public Professor insert(@RequestBody Professor professor) { /*Metodo envia o corpo do objeto */
		Professor resultado = professorRepository.save(professor);
		return resultado;
	}

	@PostMapping("/cadaluno") /*Requisição do tipo POST*/
	public Aluno insert(@RequestBody Aluno aluno) { /*Metodo envia o corpo do objeto */
		Aluno resultado = alunoRepository.save(aluno);
		return resultado;
	}
	
}
