package com.br.pizzaria.models;

public class PizzariaModel {

	private String sabor;
	private String massa;
	private String tipoDaBorda;
	private double valor;
	
	public PizzariaModel() {
		
	}
	
	public PizzariaModel(String sabor, String massa, String tipoDaBorda, double valor) {
		this.sabor = sabor;
		this.massa = massa;
		this.tipoDaBorda = tipoDaBorda;
		this.valor = valor;
		
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getTipoDaBorda() {
		return tipoDaBorda;
	}

	public void setTipoDaBorda(String tipoDaBorda) {
		this.tipoDaBorda = tipoDaBorda;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		StringBuilder modelo = new StringBuilder();
		modelo.append("sabor: " + this.sabor);
		modelo.append("massa: " + this.massa);
		modelo.append("tipo da borda" + this.tipoDaBorda);
		modelo.append("valor: " + this.valor);
		
		return super.toString();
	}
}
