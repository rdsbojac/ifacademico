package com.projeto.ifacademico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.projeto.ifacademico.entities.Aluno;
import com.projeto.ifacademico.entities.Disciplina;
import com.projeto.ifacademico.entities.Professor;
import com.projeto.ifacademico.repositories.AlunoRepository;
import com.projeto.ifacademico.repositories.DisciplinaRepository;
import com.projeto.ifacademico.repositories.ProfessorRepository;
import com.projeto.ifacademico.repositories.SecretariaRepository;

@RestController
@CrossOrigin("http://127.0.0.1:5137") // Colocar URL usada pelo Front-end 5137 é a porta
									// da extensão Live Server do VScode.
@RequestMapping("/secretaria")
public class SecretariaController {

	@Autowired
	SecretariaRepository secretariaRepository;
	@Autowired
	ProfessorRepository professorRepository;
	@Autowired
	AlunoRepository alunoRepository;
	@Autowired
	DisciplinaRepository disciplinaRepository;

	

	
	@PostMapping("/addprof") /*Requisição do tipo POST*/
	public Professor insert(@RequestBody Professor professor) { /*Metodo envia o corpo do objeto */
		Professor resultado = professorRepository.save(professor);
		return resultado;
	}

	@PostMapping("/addaluno") /*Requisição do tipo POST*/
	public Aluno insert(@RequestBody Aluno aluno) { /*Metodo envia o corpo do objeto */
		Aluno resultado = alunoRepository.save(aluno);
		return resultado;
	}
	
	@PostMapping("/adddisciplina") /*Requisição do tipo POST*/
	public Disciplina insert(@RequestBody Disciplina disciplina) { /*Metodo envia o corpo do objeto */
		Disciplina resultado = disciplinaRepository.save(disciplina);
		return resultado;
	}
	
	@DeleteMapping("/deletealuno/{id}")/*Indicação do caminho /professor/id*/
	public void deleteAlunoById(@PathVariable Long id){ /*Annotation que indica que o id passado no getMaaping é o argumento desse metodo*/
		alunoRepository.deleteById(id);
		System.out.print("Aluno deletado");
	}
	
	@DeleteMapping("/deleteprof/{id}")/*Indicação do caminho /professor/id*/
	public void deleteProfById(@PathVariable Long id){ /*Annotation que indica que o id passado no getMaaping é o argumento desse metodo*/
		professorRepository.deleteById(id);
		System.out.print("Professor deletado");
	}
	
	
	
}
