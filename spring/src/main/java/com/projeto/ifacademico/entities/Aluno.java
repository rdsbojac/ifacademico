package com.projeto.ifacademico.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="tb_aluno")
public class Aluno {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)/*o identificador único será gerado pela coluna de auto incremento do banco de dados*/
	private long idAluno;
	private String matricula;
	private String nome;
	private String sexo;
	private String dataNasc;
	private String numeroCelular;
	private String email;
	

	@OneToOne
	@JoinColumn(name = "idcurso")
	private Curso curso;
	
	
	public long getId() {
		return idAluno;
	}
	public void setId(long id) {
		this.idAluno = id;
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

	
	
}
