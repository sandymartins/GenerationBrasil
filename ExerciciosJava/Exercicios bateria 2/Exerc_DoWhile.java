package Familia57;

/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE) */

import java.util.Scanner;

public class Exerc_DoWhile {

		public static void main(String[] args) {
			
			float media;
			int num,somaMultiplo3=0,contMultiplo3=0;
			
			Scanner leia = new Scanner(System.in);
			
			do {
				System.out.println("\nEntre com um número: ");
				num = leia.nextInt();
				if(num==0) {
					System.out.println("\nVolte Sempre!!!");
				}
				else
				{
					if(num % 3 == 0) {
						somaMultiplo3 += num;
						contMultiplo3++;
					}
				}
				
			}
			while(num!=0);
			if(contMultiplo3 == 0) {
				System.out.println("\nao pode ser feita a divisão!");
			}
			else
			{
			media = somaMultiplo3 / contMultiplo3;
			System.out.println("\nMédia dos números múltiplos de 3: "+media);
			}

		}

	}

