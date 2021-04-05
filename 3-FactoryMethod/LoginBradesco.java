package org.designpatterns;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LoginBradesco extends Login {
	 private String logo = "/home/victor-gabriel/eclipse-workspace/list-apsiii/src/org/designpatterns/img/bradesco.png";
	 private String mensagem = "Seja Bem Vindo ao Bradesco!";
	 private String mensagemSuccess = "Acesso Permitido, Agora Escolha A Operação";
	 
	 public void gerarTelaLogin() {
		 final ImageIcon icon = new ImageIcon(logo);
	     JOptionPane.showMessageDialog(null, mensagem, "LOGOUT", JOptionPane.INFORMATION_MESSAGE, icon);
	     login = JOptionPane.showInputDialog("Digite seu login:");
	     senha = JOptionPane.showInputDialog("Digite sua senha:");
	     JOptionPane.showMessageDialog(null, mensagemSuccess);
	 }
	
}
