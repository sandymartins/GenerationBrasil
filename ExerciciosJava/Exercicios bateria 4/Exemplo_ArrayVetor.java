package vetoresMatrizes;

import java.util.Scanner;

public class Exemplo_ArrayVetor {

	public static void main(String[] args) {

		float[] media = new float[3];
		float n1, n2, n3, somaMedia = 0, mg;
		int x;
		try (Scanner leia = new Scanner(System.in)) {
			for (x = 0; x < media.length; x++) {
				System.out.println("\nEntre com a primeira nota: ");
				n1 = leia.nextFloat();
				System.out.println("\nEntre com a segunda nota: ");
				n2 = leia.nextFloat();
				System.out.println("\nEntre com a terceira nota: ");
				n3 = leia.nextFloat();

				media[x] = (n1 + n2 + n3) / 3;
				System.out.println("\nMédia: " + media[x]);
				somaMedia += media[x];
			}
		}

		mg = somaMedia / 3;
		System.out.println("\nMédia geral: " + mg);
		System.out.printf("\nMédia geral: %.2f", mg);

	}

}
