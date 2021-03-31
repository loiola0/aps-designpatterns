package org.designpatterns;

public class Cliente {

	public static void main(String[] args) {
		Abstracao abstracoes;
		
		abstracoes = new AbstracaoRefinada(new ImplementadorArquivoTxt());
		
		abstracoes.operacao();

	}

}
