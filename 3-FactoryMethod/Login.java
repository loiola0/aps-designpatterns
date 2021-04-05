package org.designpatterns;

public abstract class Login {
	protected String login;
	protected String senha;
	
	public Login(){}
	
	public Login(String login,String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public abstract void gerarTelaLogin();
}
