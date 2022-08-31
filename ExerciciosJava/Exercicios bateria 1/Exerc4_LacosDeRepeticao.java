package Familia57;
/* 4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

import java.util.Scanner;

public class Exerc4_LacosDeRepeticao {

	public static void main(String[] args) {
		double num,resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um número: ");
		num = leia.nextDouble();
		
		
		if (num % 2 == 0) {
			resultado = Math.sqrt(num);
			System.out.println("Par e sua raíz é "+resultado); //exemplo 10*10=100
		}
		else {
			resultado = Math.pow(num, 2);
			System.out.println("Ímpar, o cálculo é "+resultado); // ao quadrado,exemplo: 5*5=25
		}
	}

}
