package org.designpatterns.ConcreteClasses;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import org.designpatterns.AbstractClasses.MensagemLogon;

public class MensagemLogonItau extends MensagemLogon {
	
	public MensagemLogonItau() {
		super("/home/victor-gabriel/eclipse-workspace/list-aps/src/org/designpatterns/img/itau.png","Seja Bem Vindo ao Banco Itau");
	}
	
	public void mostrarTelaGrafica() {
		final ImageIcon icon = new ImageIcon(this.getLogo());
      JOptionPane.showMessageDialog(null, this.getMensagem(), "LOGON", JOptionPane.INFORMATION_MESSAGE, icon);
	}
	
}
