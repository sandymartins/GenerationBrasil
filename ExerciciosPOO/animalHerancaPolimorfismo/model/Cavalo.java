package com.generation.animal.model;

public class Cavalo extends Animal{

	public Cavalo(String nome, int idade) {
		super();
		this.nome = "Bibi";
		this.idade = 5;
	}
	
	public void emitirSom() {
		System.out.println("O som do animal é: Pocotó, Pocotó, Pocotó!");
	}

	@Override
	public void acao() {
		System.out.println("O animal está: Correndo");
		
	}
	

}
