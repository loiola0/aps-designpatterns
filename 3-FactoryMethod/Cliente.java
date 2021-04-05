package org.designpatterns;

public class Cliente {
	public static void main(String [] args) {
		Login login = LoginFactory.gerarTela(2);
		
		login.gerarTelaLogin();
		
	}
}
