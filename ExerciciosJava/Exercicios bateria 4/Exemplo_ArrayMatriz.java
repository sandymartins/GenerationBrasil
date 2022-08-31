package vetoresMatrizes;

import java.util.Scanner;

public class Exemplo_ArrayMatriz {

	public static void main(String[] args) {
		int[][] numeros = new int[3][2];
		float mediaNumImpar;
		int somaNumImpar = 0, contNumImpar = 0, i, j;

		Scanner leia = new Scanner(System.in);

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 2; j++) {
				System.out.println("\nEntre com um número: ");
				numeros[i][j] = leia.nextInt();
				if (numeros[i][j] % 2 == 1) {
					somaNumImpar += numeros[i][j];
					contNumImpar++;
				}
			}
		}
		mediaNumImpar = somaNumImpar / contNumImpar;
		System.out.println("\nMédia dos números ímpares: " + mediaNumImpar);

	}

}
