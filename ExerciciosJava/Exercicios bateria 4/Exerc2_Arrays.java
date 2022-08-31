package vetoresMatrizes;

import java.util.Scanner;

/*2- Faça um programa que receba 6 números inteiros e mostre: 
	• Os números pares digitados;  
	• A soma dos números pares digitados; 
	• Os números ímpares digitados; 
	• A quantidade de números ímpares digitados.
	 */
public class Exerc2_Arrays {

	public static void main(String[] args) {

		int[] a = new int[6];
		int i, numPar = 0, somaNumPar = 0, numImpar = 0, quantNumImpar = 0;

		Scanner leia = new Scanner(System.in);

		for (i = 0; i < 6; i++) {
			
			int[] numero = new int[6];
			int numerosPares = 0, numerosImpares = 0, somaPar = 0, quantImpares = 0;

			for (i = 0; i < 6; i++) {
				System.out.print("\nEntre com um numero: ");
				numero[i] = leia.nextInt();

				if (numero[i] % 2 == 0) {

					somaPar += numero[i];
					numerosPares++;
				} else {

					numerosImpares++;

				}
			}
			System.out.print("\nNumeros pares digitados: ");
			for (i = 0; i < 6; i++) {
				if (numero[i] % 2 == 0) {
					System.out.print(numero[i] + " ");
				}
			}

			System.out.print("\nSoma dos numeros pares: " + somaPar);

			System.out.print("\nNumeros impares digitados: ");

			for (i = 0; i < 6; i++) {
				if (numero[i] % 2 == 1) {
					System.out.print(numero[i] + " ");
				}
			}

			System.out.println("\nQuantidade de impares digitados: " + numerosImpares);

		}
	}

}
