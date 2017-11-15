package model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Login {

	@Id
	@GeneratedValue
	private int matricula;
	@Column(name = "nome")
	private String loginName;
	@Column(name = "senha")
	private String senha;

	public Login(String loginName, String senha) {
		super();
		this.loginName = loginName;
		this.senha = senha;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setNome(String loginName) {
		this.loginName = loginName;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
}
