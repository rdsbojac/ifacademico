package com.projeto.ifacademico.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_professor")
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProfessor;
	
	private String matricula;
	private String nome;
	private String sexo;
	private String dataNasc;
	private String numeroCelular;
	private String email;
	
	@OneToOne
	@JoinColumn(name = "idcurso")
	private Curso curso;
	
	
	public Professor() {}
	
	
	/*GETTERS ANDS SETTERS*/

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}



	public long getIdProfessor() {
		return idProfessor;
	}


	public void setIdProfessor(long idProfessor) {
		this.idProfessor = idProfessor;
	}
	
	/*GETTERS ANDS SETTERS*/

	
	
}
