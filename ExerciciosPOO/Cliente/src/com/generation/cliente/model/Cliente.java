package com.generation.cliente.model;

public class Cliente {
	private float telefone;
	private int idade;
	private String nome;
	private String genero;
	private String endereco;
	
	
	
	
	public Cliente(int telefone, int idade, String nome, String genero, String endereco) {
		super();
		this.telefone = telefone;
		this.idade = idade;
		this.nome = nome;
		this.genero = genero;
		this.endereco = endereco;
	}

	public void apresentarInfo() {
		System.out.println("***********************************");
		System.out.println("Dados da Cliente");
		System.out.println("***********************************");
		System.out.println("Genêro do cliente: "+ this.genero);
		System.out.println("Nome do cliente: "+ this.nome);
		System.out.println("Idade do cliente: "+ this.idade);
		System.out.println("Numero de telefone: "+ this.telefone);
		System.out.println("Endereco do cliente: "+ this.endereco);

	}
	
	
	
	public float getTelefone() {
		return telefone;
	}

	
	
	
	public void setTelefone(float telefone) {
		this.telefone = telefone;
	}

	
	
	
	public int getIdade() {
		return idade;
	}

	
	
	
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	
	
	
	public String getNome() {
		return nome;
	}

	
	
	
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
	
	
	
	public String getGenero() {
		return genero;
	}

	
	
	
	
	public void setGenero(String genero) {
		this.genero = genero;
	}

	
	
	
	
	public String getEnderenco() {
		return endereco;
	}

	
	
	
	
	public void setEnderenco(String enderenco) {
		this.endereco = enderenco;
	}
	
	
}
