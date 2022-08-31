package vetoresMatrizes;

import java.util.Scanner;

/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
public class Exerc3_Arrays {

	public static void main(String[] args) {
		
		int[][] matriz = new int [3][3];
		int linha=0, coluna, contagem=0;
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite um número: ");
		for(linha=0;linha<3;linha++) {
			
			for(coluna=0;coluna<3;coluna++) {
				System.out.println(matriz[linha][coluna]);
				matriz[linha][coluna] = leia.nextInt();
			}
			for(linha=0;linha<3;linha++) {
				for(coluna=0;coluna<3;coluna++) {
					if(matriz[linha][coluna] > 10) {
						contagem++;
					}
				}
			}
		}
		System.out.println("\nExistem na matriz "+contagem+" números maiores que 10");
	}

}
