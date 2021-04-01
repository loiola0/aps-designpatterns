package org.designpatterns.ConcreteFactoryClasses;

import org.designpatterns.AbstractFactoryClasses.FabricaAbstrata;
import org.designpatterns.ConcreteClasses.*;
import org.designpatterns.AbstractClasses.*;

public class FabricaItau extends FabricaAbstrata{
	
	public MensagemLogon mostrarTelaLogon(){
		return new MensagemLogonItau();
	};
	
	public MensagemLogout mostrarTelaLogout(){
		return new MensagemLogoutItau();
	};
}
