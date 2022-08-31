package com.generation.animal;

import com.generation.animal.model.Cachorro;
import com.generation.animal.model.Cavalo;
import com.generation.animal.model.Preguica;

public class TestaAnimal {

	//POLIMORFISMO E HERANÇA
	/*1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
	comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
	características de forma que tudo o que for comum a todos os animais fique na classe
	Animal:

	2-Implemente um programa que crie os 3 tipos de animais definidos no exercício
	anterior e invoque o método que emite o som de cada um de forma polimórfica, isto
	é, independente do tipo de animal.*/
	
	public static void main(String[] args) {
		
		Cachorro c = new Cachorro("Tobby",2);
		Cavalo cav = new Cavalo("Bibi",5);
		Preguica p = new Preguica("Juju",10);

		System.out.println("O nomo do animal é: " + c.getNome());
		System.out.println("A idade do animal é: " + c.getIdade());
		c.emitirSom();
		c.acao();
		
		System.out.println("**************");
		System.out.println("O nome do animal é: " + cav.getNome());
		System.out.println("A idade do animal é: " + cav.getIdade());
		cav.emitirSom();
		cav.acao();
		
		System.out.println("**************");
		System.out.println("O nome do animal é: " + p.getNome());
		System.out.println("A idade do animal é: " + p.getIdade());
		p.emitirSom();
		p.acao();
		

	}

}
