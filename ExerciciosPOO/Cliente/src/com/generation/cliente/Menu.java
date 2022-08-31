package com.generation.cliente;

import com.generation.cliente.model.Cliente;

public class Menu {
	  /*
    Crie uma classe cliente e apresente os atributos e métodos referentes esta classe,
    em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as
    informações deste objeto no console.
     */
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente(968465185, 21, "Sandy", "Feminino", "Avenida Eliseu de Almeida");
		cliente1.apresentarInfo();
		
		
		
	}
}
