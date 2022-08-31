package com.generation.paciente;

public class Paciente {
	private String nome;
	private int idade;
	private String endereco;
	private float numResidencial;
	private float rg;
	private float cpf;
	private String sintomas;
	
	
	
	public Paciente(String nome, int idade, String endereco, float numResidencial, float rg, float cpf,
			String sintomas) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.numResidencial = numResidencial;
		this.rg = rg;
		this.cpf = cpf;
		this.sintomas = sintomas;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	public float getNumResidencial() {
		return numResidencial;
	}



	public void setNumResidencial(float numResidencial) {
		this.numResidencial = numResidencial;
	}



	public float getRg() {
		return rg;
	}



	public void setRg(float rg) {
		this.rg = rg;
	}



	public float getCpf() {
		return cpf;
	}



	public void setCpf(float cpf) {
		this.cpf = cpf;
	}



	public String getSintomas() {
		return sintomas;
	}



	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}
	
	
	public void infosPaciente() {
		System.out.println("***********************************");
		System.out.println("Dados do paciente");
		System.out.println("***********************************");
		System.out.println("\nNome do paciente: "+this.nome);
		System.out.println("\nIdade do paciente: "+this.idade);
		System.out.println("\nEndereço do paciente: "+this.endereco);
		System.out.println("\nTelefone residencial do paciente: "+this.numResidencial);
		System.out.println("\nRG do paciente: "+this.rg);
		System.out.println("\nCPF do paciente: "+this.cpf);
		System.out.println("\nSintomas do paciente: "+this.sintomas);
	}
	
	
}
