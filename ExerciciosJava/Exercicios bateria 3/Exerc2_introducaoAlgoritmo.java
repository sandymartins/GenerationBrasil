package Familia57;

import java.util.Scanner;

public class Exerc2_introducaoAlgoritmo {

	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int n1, n2, n3;

		System.out.println("Entre com um número: ");
		n1 = ler.nextInt();
		System.out.println("Entre com um segundo número: ");
		n2 = ler.nextInt();
		System.out.println("Entre com um terceiro número: ");
		n3 = ler.nextInt();

		if (n1 < n2 && n2 < n3) {
			System.out.println("O números na ordem crescente são: " + n1 + n2 + n3);
		} else if (n1 < n3 && n3 < n2) {
			System.out.println("O números na ordem crescente são: " + n1 + n3 + n2);
		} else if (n2 < n1 && n1 < n3) {
			System.out.println("O números na ordem crescente são: " + n2 + n1 + n3);
		} else if (n2 < n3 && n1 < n2) {
			System.out.println("O números na ordem crescente são: " + n2 + n3 + n1);
		} else if (n3 < n1 && n1 < n2) {
			System.out.println("O números na ordem crescente são: " + n3 + n1 + n2);
		} else {
			System.out.println("O números na ordem crescente são: " + n3 + n2 + n1);
		}

	}

}
