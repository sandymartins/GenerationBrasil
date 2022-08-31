package com.generation.patinete;

public class Patinete {
	private String tipo;
	private String marca;
	private String modelo;
	private float codigoBarras;
	private float valor;
	
	public Patinete(String tipo, String marca, String modelo, float codigoBarras, float valor) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.modelo = modelo;
		this.codigoBarras = codigoBarras;
		this.valor = valor;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public float getCodigoBarras() {
		return codigoBarras;
	}


	public void setCodigoBarras(float codigoBarras) {
		this.codigoBarras = codigoBarras;
	}


	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public void InfoPatins() {
		System.out.println("\nTipo do Patinete: "+this.tipo);
		System.out.println("\nMarco do Patinete: "+this.marca);
		System.out.println("\nModelo do Patinete: "+this.modelo);
		System.out.println("\nCódigo de barras do Patinete: "+this.codigoBarras);
		System.out.println("\nValor do Patinete: "+this.valor);
	}
}
