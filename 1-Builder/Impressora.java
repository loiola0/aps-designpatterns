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
			
		//c.getListaItem().size();
		System.out.println("   "+c.getNomeLoja()+"   ");
		System.out.println(c.getCnpj());
		System.out.println(data);
		System.out.println("---------------------------------------");
		System.out.println("CNPJ/CPF consumidor: "+documento);
		System.out.println("   "+"CUPOM FISCAL"+"   ");
		System.out.println("ITEM     CÓDIGO    DESCRIÇÃO");
		System.out.println("       QTDxUNITÁRIO     Valor(R$)");
		System.out.println();
		
			for(int i = 0;i<c.getListaItem().length;i++) {
				
				if(c.getListaItem()[i] != null) {
					System.out.println(i+"      "+c.getListaItem()[i].getCodigo()+"        "+c.getListaItem()[i].getNome());
					System.out.println("         "+c.getListaItem()[i].getQuantidade()+"x"+c.getListaItem()[i].getValorUnitario()+"         "+c.getListaItem()[i].calculoValorTotal(c.getListaItem()[i].getValorUnitario(),c.getListaItem()[i].getQuantidade()));
					total+=c.getListaItem()[i].calculoValorTotal(c.getListaItem()[i].getValorUnitario(),c.getListaItem()[i].getQuantidade());
				}else {
					break;
				}
				
			}
		System.out.println("");	
		double dinheiroRecebido = c.getDinheiroRecebido();
		double troco = dinheiroRecebido - total;
		System.out.println("TOTAL R$                "+total);
		System.out.println("VALOR RECEBIDO R$       "+c.getDinheiroRecebido());
		System.out.println("TROCO R$                "+troco);
		System.out.println("---------------------------------------");
		
		
		
	}
	
	public void imprimirNota(CupomFiscal [] c) {
		for(int i = 0;i<c.length;i++) {
			if(c.length>0) {
				imprimirNota(c[i]);
				System.out.println("");
			}else {
				System.out.println("A lista de cupons está vazia");
			}
		}
	}
		
	
}
