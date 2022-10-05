package com.projeto.ifacademico.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	

}
