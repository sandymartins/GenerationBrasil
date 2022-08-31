package Familia57;

/* Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.*/

import java.util.Scanner;

public class Exerc_While {

	public static void main(String[] args) {
int idade,genero,fp,contpc=0,contmn=0,contha=0,contbc=0,contpn40=0,contpc18=0,p=1;
		
		Scanner leia = new Scanner(System.in);
		
		while(p<=150) {
			
			System.out.println("\nEntre com a sua idade: ");
			idade = leia.nextInt();
			System.out.println("\nEntre com o seu gênero:\n1-Feminino\n2-Masculino\n3-Binário ");
			genero = leia.nextInt();
			System.out.println("\nEntre com o fator psicológico:\n1- Calma\n2-Nervosa\n3-Agressiva");
			fp = leia.nextInt();
			
			if(fp==1) {
				contpc++;
			}
			
			if(genero == 1 && fp == 2) {
				contmn++;
			}
			
			if(genero == 2 && fp == 3) {
				contha++;
			}
			
			if(genero == 3 && fp == 1) {
				contbc++;
			}
			
			if(fp == 2 && idade>40) {
				contpn40++;
			}
			
			if(fp == 1 && idade <18) {
				contpc18++;
			}
			p++;
		}
		
		System.out.println("\nNúmero de pessoas calmas: "+contpc);
		System.out.println("\nNúmero de mulheres nervosas: "+contmn);
		System.out.println("\nNúmero de homens agressivos: "+contha);
		System.out.println("\nNúmero de pessoas binárias calmas: "+contbc);
		System.out.println("\nNúmero de pessoas nervosas com mais de 40 anos: "+contpn40);
		System.out.println("\nNúmero de pessoas calmas com menos de 18 anos: "+contpc18);

	}



	}


