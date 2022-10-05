package com.projeto.ifacademico.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_disciplina")
public class Disciplina {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDisciplina;
	private String nome;
	private int codhorario;
	
	@ManyToOne
	@JoinColumn(name = "idcurso")
	private Curso curso;
	
	

	
	public Disciplina() {
	}


	public int getId() {
		return idDisciplina;
	}


	public void setId(int id) {
		this.idDisciplina = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCodhorario() {
		return codhorario;
	}


	public void setCodhorario(int codhorario) {
		this.codhorario = codhorario;
	}



	
	
	
	
}