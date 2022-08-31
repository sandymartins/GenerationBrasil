package Familia57;
//1- Faça um programa que receba três inteiros e diga qual deles é o maior.

import java.util.Scanner;
 
public class Exerc1_LacosDeDecisao {
		public static void main(String[] args) {
			int num1,num2,num3;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("\nDigite o primeiro número: ");
			num1 = leia.nextInt(); 
			System.out.println("\nDigite o segundo número: ");
			num2 = leia.nextInt();
			System.out.println("\nDigite o terceiro número: ");
			num3 = leia.nextInt();
			
			if(num1>=num2 && num1>=num3) {
				System.out.println("\nO maior número foi: "+num1);
			}else if (num2>=num1 && num2>=num3){
				System.out.println("\nO maior número foi: "+num2);
			}else {
				System.out.println("\nO maior número foi: "+num3);
			}
		}
}
