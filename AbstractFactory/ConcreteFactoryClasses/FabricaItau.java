package org.designpatterns.ConcreteFactoryClasses;

import org.designpatterns.AbstractFactoryClasses.FabricaAbstrata;
import org.designpatterns.ConcreteClasses.*;
import org.designpatterns.AbstractClasses.*;

public class FabricaItau extends FabricaAbstrata{
	
	public MensagemLogon gerarMensagemLogin(){
		return new MensagemLogonItau();
	};
	
	public MensagemLogout gerarMensagemLogout(){
		return new MensagemLogoutItau();
	};
}
