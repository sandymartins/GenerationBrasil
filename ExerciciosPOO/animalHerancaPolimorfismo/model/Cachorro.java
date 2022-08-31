package com.generation.animal.model;

public class Cachorro extends Animal{

	public Cachorro(String nome, int idade) {
		super();
		this.nome = "Tobby";
		this.idade = 10;
		
	}
	
	public void emitirSom() {
		System.out.println("O Som do animal é: AU AU AU");
	}
	
	@Override
	public void acao() {
		System.out.println("O animal está: Correndo");
	}
	

}
