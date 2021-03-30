package org.designpatterns;

public class CupomFiscal {
	//mandatory attributes
	private String nomeLoja;
	private String cnpj;
	
	//optional attributes
	private String cpfConsumidor;
	private String cnpjConsumidor;
	private double dinheiroRecebido;
	private Item listaItem;
	
	//constructor
	private CupomFiscal(CupomFiscalBuilder builder) {
		this.nomeLoja = builder.nomeLoja;
		this.cnpj = builder.cnpj;
		this.cnpjConsumidor = builder.cnpjConsumidor;
		this.cpfConsumidor = builder.cpfConsumidor;
		this.dinheiroRecebido = builder.dinheiroRecebido;
		this.listaItem = builder.listaItem;
	}
	
	
	public static class CupomFiscalBuilder{
		
		//mandatory attributes
		private String nomeLoja;
		private String cnpj;
		
		//optional attributes
		private String cpfConsumidor;
		private String cnpjConsumidor;
		private double dinheiroRecebido;
		private Item listaItem;
		
		
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
			this.listaItem = listaItem;
			return this;
		}
		
		public CupomFiscal build() {
			return new CupomFiscal(this);
		}
		
	}
	
	
}


