package com.projeto.ifacademico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.projeto.ifacademico.entities.Curso;
import com.projeto.ifacademico.repositories.CursoRepository;


@RestController
@CrossOrigin("http://127.0.0.1:5137") // Colocar URL usada pelo Front-end 5137 é a porta
									// da extensão Live Server do VScode.
@RequestMapping(value = "/curso")
public class CursoController {
	
	@Autowired /*Responsabilidade da estancia fica com o SpringBoot*/
	private CursoRepository cursoRepository;
	
	
	@GetMapping /*Tipo de Requisição WEB*/
	public List<Curso>findAll(){
		List<Curso> resultado = cursoRepository.findAll();
		return resultado;
	}
	/*Metodo deve mostrar quando passado o id do curso todas as disciplinas deste curso*/
	@GetMapping(value = "/{id}")/*Indicação do caminho /Curso/id*/
	public Curso findById(@PathVariable Long id){ /*Annotation que indica que o id passado no getMapping é o argumento desse metodo*/
		Curso resultado = cursoRepository.findById(id).get();
		return resultado;
	}
	
	

}
