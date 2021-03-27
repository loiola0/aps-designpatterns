package org.designpatterns.ConcreteFactoryClasses;

import org.designpatterns.AbstractFactoryClasses.FabricaAbstrata;
import org.designpatterns.ConcreteClasses.*;
import org.designpatterns.AbstractClasses.*;

public class FabricaBradesco extends FabricaAbstrata{
	
	public MensagemLogon gerarMensagemLogin(){
		return new MensagemLogonBradesco();
	};
	
	public MensagemLogout gerarMensagemLogout(){
		return new MensagemLogoutBradesco();
	};
}
