package org.designpatterns.ConcreteFactoryClasses;

import org.designpatterns.AbstractFactoryClasses.FabricaAbstrata;
import org.designpatterns.ConcreteClasses.*;
import org.designpatterns.AbstractClasses.*;

public class FabricaBradesco extends FabricaAbstrata{
	
	public MensagemLogon mostrarTelaLogon(){
		return new MensagemLogonBradesco();
	};
	
	public MensagemLogout mostrarTelaLogout(){
		return new MensagemLogoutBradesco();
	};
}
