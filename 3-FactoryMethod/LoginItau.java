package org.designpatterns;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LoginItau extends Login{
	private String logo = "/home/victor-gabriel/eclipse-workspace/list-apsiii/src/org/designpatterns/img/itau.png";
	private String mensagem = "Seja Bem Vindo ao Itau!";
	private String mensagemSuccess = "Acesso Permitido, Agora Escolha A Operação";
	 
	 public void gerarTelaLogin() {
		 final ImageIcon icon = new ImageIcon(logo);
	     JOptionPane.showMessageDialog(null, mensagem, "LOGOUT", JOptionPane.INFORMATION_MESSAGE, icon);
	     login = JOptionPane.showInputDialog("Digite seu login:");
	     senha = JOptionPane.showInputDialog("Digite sua senha:");
	     JOptionPane.showMessageDialog(null, mensagemSuccess);
	 }
}

