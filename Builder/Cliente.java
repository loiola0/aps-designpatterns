package org.designpatterns;



public class Cliente {

	public static void main(String[] args) {
		
		Item item1 = new Item(943,"Bolo de Cenoura 500g", 22.90, 1);
		Item item2 = new Item(013, "Ovos de chocolate Nestlé", 89.99, 4);
		
		
		Item item3 = new Item(123, "Notebook Lenovo-idealpad", 3200.0, 1);
		Item item4 = new Item(343, "Teclado Game", 120.0, 2);
		Item item5 = new Item(896,"Fone de ouvido", 50.0, 1);
		
		Item item6 = new Item(102,"Ssd SanDisk 258Gb", 250, 2);
		
		CupomFiscal cupom1 = new CupomFiscal.CupomFiscalBuilder("John Wick Sousa", "18.245.102/0001-32")
				.cpfConsumidor("083.734.542-23")
				.dinheiroRecebido(150.0)
				.listaItem(item1)
				.listaItem(item2)
				.build();

		CupomFiscal cupom2 = new CupomFiscal.CupomFiscalBuilder("Alcoouegelsion Junior Monteiro", "60.190.830/0001-50")
				.cpfConsumidor("357.791.180-86")
				.dinheiroRecebido(4320.0)
				.listaItem(item3)
				.listaItem(item4)
				.listaItem(item5)
				.listaItem(item6)
				.build();
	
		//Impressora.getInstance().imprimirNota(cupom1);
		//Impressora.getInstance().imprimirNota(cupom2);
		
		CupomFiscal [] listaCupons = {cupom1,cupom2};
		
		Impressora.getInstance().imprimirNota(listaCupons);
		
		
		
	}

}
