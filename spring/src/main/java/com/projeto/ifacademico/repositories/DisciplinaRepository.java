package com.projeto.ifacademico.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.ifacademico.entities.Disciplina;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long>{	
	
	/*Depois do By iniciar o atributo com Letra maiuscula*/
	List<Disciplina> findByPeriodo(int periodo);
	List<Disciplina> findByOrderByNome();
	List<Disciplina> findByOrderByCodhorario();
	List<Disciplina> findByOrderByCurso();
	List<Disciplina> findByOrderByPeriodo();
	List<Disciplina> findByOrderByPeriodoAscCursoDesc();
	
	
}
