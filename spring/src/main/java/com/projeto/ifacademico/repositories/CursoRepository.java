package com.projeto.ifacademico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.ifacademico.entities.Curso;


public interface CursoRepository extends JpaRepository<Curso, Long>{
	

}
