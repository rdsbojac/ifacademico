package com.projeto.ifacademico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.ifacademico.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}
