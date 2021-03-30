package org.designpatterns;

public abstract class CupomFiscalBuilder {
	
	protected CupomFiscal cupomFiscal;
	
	public CupomFiscalBuilder() {
		cupomFiscal = new CupomFiscal();
	}
	
	public abstract void buildNomeLoja();
	public abstract void buildCnpj();
	public abstract void buildCpfConsumidor();
	public abstract void buildCnpjConsumidor();
	public abstract void buildDinheiroRecebido();
	public abstract void buildItem();

}
