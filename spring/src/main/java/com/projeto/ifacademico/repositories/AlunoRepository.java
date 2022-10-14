package com.projeto.ifacademico.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projeto.ifacademico.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{

	List<Aluno> findByNome(String matricula);
	List<Aluno> findByMatricula(String matricula);
	
	@Query(value = "SELECT * FROM TB_ALUNO WHERE IDCURSO=1", nativeQuery = true)
	Aluno findByCurso();
	
	
}
