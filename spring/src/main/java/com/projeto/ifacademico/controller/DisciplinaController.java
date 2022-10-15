package com.projeto.ifacademico.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.ifacademico.entities.Disciplina;
import com.projeto.ifacademico.repositories.DisciplinaRepository;

@RestController /*Controlador REST*/
@RequestMapping(value = "/disciplina") /*Qual caminho este controlador responde*/
public class DisciplinaController {
	
	@Autowired /*Não é necessario estanciar este objeto, o spring se encarrega disso usando esta annotation*/ 
 	private DisciplinaRepository disciplinaRepository;

	
	@GetMapping /*Tipo de requisição GET*/
	public List<Disciplina>findAll(){ /*Metodo que retorna todas as disciplinas cadastradas */
		List<Disciplina> resultado = disciplinaRepository.findAll();
		return resultado;
	}
	
	@GetMapping("/{periodo}")/*Buscar Periodo especifico passando o mesmo na URL*/
	public List<Disciplina> findByPeriodo(@PathVariable int periodo){
		List<Disciplina> resultado = disciplinaRepository.findByPeriodo(periodo);
		return resultado;
	}
	
	@GetMapping("/orderByPeriodo")/*Ordenar todos as disciplinas por periodo*/
	public ResponseEntity<List<Disciplina>> findOrderByPeriodo(){
		List<Disciplina> resultado = disciplinaRepository.findByOrderByPeriodo();
		return ResponseEntity.ok(resultado);
	}
	
	@GetMapping("/orderByName")/*Ordenar as disciplinas por nome*/
	public ResponseEntity<List<Disciplina>> findOrderByName(){
		List<Disciplina> resultado = disciplinaRepository.findByOrderByNome();
		return ResponseEntity.ok(resultado);
	}
	
	@GetMapping("/orderByCodhorario")/*Ordenar as disciplinas por codigo do horario*/
	public ResponseEntity<List<Disciplina>> findBycodhorario(){
		List<Disciplina> resultado = disciplinaRepository.findByOrderByCodhorario();
		return ResponseEntity.ok(resultado);
		
	}
	@GetMapping("/orderByCurso")/*Ordenar disciplinas pelo Curso(ID DO CURSO)*/
	public ResponseEntity<List<Disciplina>> findOrderByCurso(){
		List<Disciplina> resultado = disciplinaRepository.findByOrderByCurso();
		return ResponseEntity.ok(resultado);
	}
	
	@GetMapping("/orderByPeriodoAndCurso")/*Ordenar disciplinas pelo Curso(ID DO CURSO)*/
	public ResponseEntity<List<Disciplina>> findOrderBypPeriodoAndCurso(){
		List<Disciplina> resultado = disciplinaRepository.findByOrderByPeriodoAscCursoDesc();
		return ResponseEntity.ok(resultado);
	}
	
}
