package org.designpatterns.ConcreteClasses;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import org.designpatterns.AbstractClasses.MensagemLogout;

public class MensagemLogoutItau extends MensagemLogout{
	
	
		public MensagemLogoutItau() {
			super("/home/victor-gabriel/eclipse-workspace/list-aps/src/org/designpatterns/img/itau.png","O Banco Itau te aguarda até próxima!");
		}
		
		public void mostrarTelaGrafica() {
			final ImageIcon icon = new ImageIcon(this.getLogo());
			JOptionPane.showMessageDialog(null, this.getMensagem(), "LOGOUT", JOptionPane.INFORMATION_MESSAGE, icon);
		}
		
	
}
