package org.designpatterns;

import org.designpatterns.AbstractFactoryClasses.FabricaAbstrata;
import org.designpatterns.AbstractClasses.*;

public class Cliente {
		
		public static void main(String [] args) throws Exception{
			/**Fornecer uma interface para criação de famílias de objetos relacionados ou dependentes
			   sem especificar suas classes concretas.*/
			FabricaAbstrata fbs = FabricaAbstrata.getInstance("1-YYSYAYSD"); 
			MensagemLogon tlgn = fbs.mostrarTelaLogon();
			tlgn.mostrarTelaGrafica();
			//MensagemLogout tlgt = fbs.mostrarTelaLogout();
			//tlgt.mostrarTelaGrafica();
			
			//codigo swing para gerar tela;
		}
	
}
