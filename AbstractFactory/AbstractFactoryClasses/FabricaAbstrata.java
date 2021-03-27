package org.designpatterns.AbstractFactoryClasses;

import org.designpatterns.util.Util;
import org.designpatterns.util.UtilConstantes;
import org.designpatterns.ConcreteFactoryClasses.FabricaBradesco;
import org.designpatterns.ConcreteFactoryClasses.FabricaItau;

public abstract class FabricaAbstrata {
	
	public abstract void mostrarTelaLogon();
	public abstract void mostrarTelaLogout();
	
	public static FabricaAbstrata getInstance(String codigoBanco) throws Exception{
		int _codigoBanco = Util.getInstance().codigoBanco(codigoBanco);
		
		if(_codigoBanco == UtilConstantes_CODIGO_BRADESCO) {
				return new FabricaBradesco();
		}else if(_codigoBanco == UtilConstantes.CODIGO_ITAU) {
				return new FabricaItau();
		}else {
				throw new Exception("Serial inválido!");
		}
	}
	
}
