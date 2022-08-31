package Familia57;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		int valor,somaValor=0;
		
		Scanner leia = new Scanner(System.in);

		do //executa pelo menos uma vez e depois testa a condição
		{
			System.out.println("\nEntre com um valor: ");
			valor = leia.nextInt();
			
			somaValor += valor;//somando todos os valores, inicialmente ele vai se somar começando com 0, assim como foi declarado na variável somaValor=0.
			
		}while(somaValor<=300);//quando a condição constar falsa, ele vai somar o resultado.
		
		System.out.println("\nSomatório dos valores: "+somaValor);

	}

}
