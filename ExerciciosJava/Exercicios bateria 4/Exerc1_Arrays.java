package vetoresMatrizes;
/* 1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
	(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
	(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
	(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
	(d) Mostre na tela cada valor do vetor A, um em cada linha.
	 */
public class Exerc1_Arrays {

	public static void main(String[] args) {
		
		int[] a =  new int [6];
		a[0] =1;
		a[1]=0;
		a[2]=5;
		a[3]=-2;
		a[4]=100;
		a[5]=-7;
		
		int soma=0,i;
		
		soma = a[0]+a[1]+a[5];
		
		System.out.println("A soma dos valores é: "+soma);
		System.out.println("Valor do vetor A: ");
		
		for(i=0;i<6;i++) {
			a[4]=100;
			System.out.println(a[i]);
		}

	}

}
