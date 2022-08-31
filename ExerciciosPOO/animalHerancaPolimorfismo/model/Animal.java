package com.generation.animal.model;

import java.util.Scanner;

public abstract class Animal {
	//Atributos de animal
	public String nome;
	public int idade;
	
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	Scanner leia = new Scanner(System.in);
	
	//MÉTODOS DE ANIMAL
	public abstract void emitirSom();
	public abstract void acao();
	
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	//GET = PEGAR/OBTER
	//SET = ATRIBUIR, DEFINIR
	public int getIdade() { //Método 
		return idade;
	}

	public void setIdade(int idade) { //Atributo
		this.idade = idade;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
