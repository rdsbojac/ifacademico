package com.projeto.ifacademico.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.ifacademico.entities.Disciplina;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long>{	
	
	List<Disciplina> findByPeriodo(int periodo);

	

}
