package Familia57;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		int numero,somaNumero=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um número: ");
		numero = leia.nextInt();
		
		while(numero!=0) { //diferente de zero. ou enquanto o usuario nao digitar zero, vai rodar.
			
			if(numero % 3 == 0) { //se ele for múltiplo de 3
				somaNumero += numero;
			}
			System.out.println("\nEntre com um número: ");
			numero = leia.nextInt();//
		}
		System.out.println("\nSomatório dos números múltiplos de 3: "+somaNumero);

	}

}
