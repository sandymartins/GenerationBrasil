package com.generation.animal.model;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super();
		this.nome = "Juju";
		this.idade = 8;
		
	}
	
	public void emitirSom() {
		System.out.println("O som do animal é: zzzzzzzzzzzzzzz...");
	}

	@Override
	public void acao() {
		System.out.println("O animal está: Subindo na árvore");
		
	}
}
