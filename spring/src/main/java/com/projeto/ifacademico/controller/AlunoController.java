package com.projeto.ifacademico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<List<Aluno>>findAll(){
		List<Aluno> resultado = alunoRepository.findAll();
		return ResponseEntity.ok(resultado);
	}
	
	@GetMapping(value = "/{id}")
	public Aluno findById(@PathVariable Long id) {
		Aluno resultado = alunoRepository.findById(id).get();
		return resultado;
	}
	
	@GetMapping(value = "/nome/{nome}")
	public List<Aluno> findByNome(@PathVariable String nome) {
		return alunoRepository.findByNome(nome);
	}
	
	@GetMapping(value = "/matricula/{matricula}")
	public List<Aluno> findByMatricula(@PathVariable String matricula) {
		return alunoRepository.findByMatricula(matricula);
	}
	
	@GetMapping(value = "/curso")
	public Aluno findByCurso() {
		return alunoRepository.findByCurso();
	}

}
