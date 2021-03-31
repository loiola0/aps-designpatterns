package org.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class CupomFiscal {
	//mandatory attributes
	private String nomeLoja;
	private String cnpj;
	
	//optional attributes
	private String cpfConsumidor;
	private String cnpjConsumidor;
	private double dinheiroRecebido;
	private ArrayList<Item> listaItem = new ArrayList<Item>();
	
	//constructor
	private CupomFiscal(CupomFiscalBuilder builder) {
		this.nomeLoja = builder.nomeLoja;
		this.cnpj = builder.cnpj;
		this.cnpjConsumidor = builder.cnpjConsumidor;
		this.cpfConsumidor = builder.cpfConsumidor;
		this.dinheiroRecebido = builder.dinheiroRecebido;
		this.listaItem = builder.listaItem;
	}
		
	public String getNomeLoja() {
		return nomeLoja;
	}

	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCpfConsumidor() {
		return cpfConsumidor;
	}

	public void setCpfConsumidor(String cpfConsumidor) {
		this.cpfConsumidor = cpfConsumidor;
	}

	public String getCnpjConsumidor() {
		return cnpjConsumidor;
	}

	public void setCnpjConsumidor(String cnpjConsumidor) {
		this.cnpjConsumidor = cnpjConsumidor;
	}

	public double getDinheiroRecebido() {
		return dinheiroRecebido;
	}

	public void setDinheiroRecebido(double dinheiroRecebido) {
		this.dinheiroRecebido = dinheiroRecebido;
	}

	public ArrayList<Item> getListaItem() {
		return listaItem;
	}

	public void setListaItem(Item listaItem) {
		this.listaItem.add(listaItem);
	}

	
	
	public static class CupomFiscalBuilder{
		
		//mandatory attributes
		private String nomeLoja;
		private String cnpj;
		
		//optional attributes
		private String cpfConsumidor;
		private String cnpjConsumidor;
		private double dinheiroRecebido;
		private ArrayList<Item> listaItem;
		
		
		public CupomFiscalBuilder(String nomeLoja, String cnpj) {
			this.nomeLoja = nomeLoja;
			this.cnpj = cnpj;
		}
		
		public CupomFiscalBuilder cpfConsumidor(String cpfConsumidor) {
			this.cpfConsumidor = cpfConsumidor;
			return this;
		}
		
		public CupomFiscalBuilder cnpjConsumidor(String cnpjConsumidor) {
			this.cnpjConsumidor = cnpjConsumidor;
			return this;
		}
		
		public CupomFiscalBuilder dinheiroRecebido(double dinheiroRecebido) {
			this.dinheiroRecebido = dinheiroRecebido;
			return this;
		}
		
		public CupomFiscalBuilder listaItem(Item listaItem) {
			this.listaItem.add(listaItem);
			return this;
		}
		
		public CupomFiscal build() {
			return new CupomFiscal(this);
		}
		
	}
	
	
}


