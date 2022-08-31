package com.generation.aviao;

public class Aviao {
	
	private String marca;
	private int anoFabricacao;
	private String cor;
	private float valor;
	
	
	public Aviao(String marca, int anoFabricacao, String cor, float valor) {
		super();
		this.marca = marca;
		this.anoFabricacao = anoFabricacao;
		this.cor = cor;
		this.valor = valor;
		
		
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public int getAnoFabricacao() {
		return anoFabricacao;
	}


	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public void infosAviao() {
		System.out.println("\nMarca do avião: "+this.marca);
		System.out.println("\nAno de Fabricação do avião: "+this.anoFabricacao);
		System.out.println("\nCor do avião: "+this.cor);
		System.out.println("\nValor do avião: "+this.valor);
		
	}
}
