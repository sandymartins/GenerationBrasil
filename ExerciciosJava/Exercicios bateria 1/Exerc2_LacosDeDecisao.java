package Familia57;

//2- Faça um programa que entre com três números e coloque em ordem crescente.
import java.util.Scanner;

public class Exerc2_LacosDeDecisao {
	public static void main(String[] args) {
		int a, b, c;
		 //1   2   3
		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite o primeiro número: ");
		a = leia.nextInt();
		System.out.println("\nDigite o segundo número: ");
		b = leia.nextInt();
		System.out.println("\nDigite o terceiro número: ");
		c = leia.nextInt();
					
		if(a < b) { //a,b,c
			if(b < c) {
				System.out.println(a+"\n"+b+"\n"+c);
			}
			else if(a < c) {
				System.out.println(a+"\n"+c+"\n"+b);
			} else {
				System.out.println(c+"\n"+a+"\n"+b);
			}
		}
		
		else if(b < c) {
			if(a < c) {
				System.out.println(b+"\n"+a+"\n"+c);
			} else {
				System.out.println(b+"\n"+c+"\n"+a);
			}
		}else {
			System.out.println(c+"\n"+b+"\n"+a);
		}
		
	}
}
