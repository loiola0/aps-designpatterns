package org.designpatterns;

public class LoginFactory{
	
	public static Login gerarTela(int codBanco) {
		if(codBanco == NumeroBanco.CODIGO_BRADESCO) {
				return new LoginBradesco();
		}else if (codBanco == NumeroBanco.CODIGO_ITAU){
				return new LoginItau();
		}else {
			return null;
		}
	}
}
