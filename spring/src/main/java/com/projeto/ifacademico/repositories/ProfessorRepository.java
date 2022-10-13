package com.projeto.ifacademico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.ifacademico.entities.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long>{

}
