package org.designpatterns;



public class Cliente {

	public static void main(String[] args) {
		
		Item i1 = new Item(8123, "Brinquedo", 50.0, 1);
		Item i2 = new Item(1258, "Rosquinha", 4.0, 10);
		Item i3 = new Item(2205,"Mouse", 30.0, 2);
		
		Item i4 = new Item(8123, "Teclado RGB", 150.0, 1);
		Item i5 = new Item(1258, "Mouse Pad 30", 40.0, 10);
		Item i6 = new Item(2205,"HeadSet pro", 90.0, 2);
		
		Item i7 = new Item(1002,"Ssd", 250, 2);
		
		CupomFiscal cupom1 = new CupomFiscal.CupomFiscalBuilder("Jhameson TecHs", "65.784.576/0001-32")
				.cpfConsumidor("966.416.840-83")
				.dinheiroRecebido(900.0)
				//.listaItem(i4)
				//.listaItem(i5)
				//.listaItem(i6)
				.build();

		CupomFiscal cupom2 = new CupomFiscal.CupomFiscalBuilder("Acer Brasil", "27.209.680/0001-04")
				.cpfConsumidor("357.791.180-86")
				.dinheiroRecebido(5600.0)
				//.listaItem(i7)
				.build();
	
		Impressora.getInstance().imprimirNota(cupom1);
		//Impressora.getInstance().imprimirNota(cupom2);

		
		
		
		
	}

}
