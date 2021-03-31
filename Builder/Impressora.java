package org.designpatterns;

import java.util.Date;

public class Impressora {
	
	private static Impressora uniqueInstance = new Impressora();

	private Impressora() {
	}

	public static Impressora getInstance() {
		return uniqueInstance;
	}
	
	public void imprimirNota(CupomFiscal c) {
		Date data = new Date();
		double total = 0;
		String documento = "";
			if(c.getCnpjConsumidor() == null || c.getCnpjConsumidor() == "0") {
				documento = c.getCpfConsumidor();
			}else {
				documento = c.getCnpjConsumidor();
			}
			
	

		System.out.println("   "+c.getNomeLoja()+"   ");
		System.out.println(c.getCnpj());
		System.out.println(data);
		System.out.println("--------------------------");
		System.out.println("CNPJ/CPF consumidor: "+documento);
		System.out.println("   "+"CUPOM FISCAL"+"   ");
		System.out.println("ITEM     CÓDIGO    DESCRIÇÃO");
		System.out.println("       QTDxUNITÁRIO     Valor(R$)");
		System.out.println();
		//for(int i = 0;i<c.getListaItem().size();i++) {
			//System.out.println(i+"  "+c.getListaItem().get(i).getCodigo()+" "+c.getListaItem().get(i).getNome());
			//System.out.println("     "+c.getListaItem().get(i).getQuantidade()+"x"+c.getListaItem().get(i).getValorUnitario());
			//total+=c.getListaItem().get(i).calculoValorTotal(c.getListaItem().get(i).getValorUnitario(),c.getListaItem().get(i).getQuantidade());
		//}
		double dinheiroRecebido = c.getDinheiroRecebido();
		double troco = dinheiroRecebido - total;
		System.out.println("TOTAL R$                "+total);
		System.out.println("VALOR RECEBIDO R$       "+c.getDinheiroRecebido());
		System.out.println("TROCO R$                "+troco);
		System.out.println("--------------------------");
		
		
		
	}
}
