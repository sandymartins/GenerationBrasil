package Familia57;

import java.util.Scanner;

public class OlaMundo {
		public static void main(String[] args) {
		
			String nome = "Veronica Pupo";
			int idade = 30,op;
			double altura = 1.52, nota1,nota2,nota3,media;
			//impresão das variaveis
			
			Scanner leia = new Scanner(System.in); 
			//Ele está dando o nome da função Scanner e chamando ela de leia. 
			//a função scanner é semelhante a versao leia.
			System.out.println("\nVamos apresentar os dados da Veronica");
			System.out.println("\nNome da participante: "+nome);
			System.out.println("\nIdade da participante: "+idade+" ano(s) de vida");
			System.out.println("\nAltura da participante: "+altura);
			
			System.out.println("\nEntre com a primeira nota: ");
			nota1 = leia.nextDouble();
			System.out.println("\nEntre com a segunda nota: ");
			nota2 = leia.nextDouble();
			System.out.println("\nEntre com a terceira nota: ");
			nota3 = leia.nextDouble();
			
			media = (nota1+nota2+nota3)/3;	
			System.out.println("\nMédia artimética: "+media);
			System.out.printf("\nMédia artimética: %.2f",media);//Ferramenta para arredondar ( Math.round tbm arrendonda)
																//O printf indica que é um dado do tipo float que é double  
																//e o %.2 é o número de casas depois da vírgula
			if(media>=7 && media<=10){							//&& ="e" || = "ou"
				System.out.println("\nAlune aprovade!!!");
			}else if(media>=5 && media<7){
				System.out.println("\nAlune de exame!!!");
			}else {
				System.out.println("\nAlune Reprovade!!!");
			}
			
			System.out.println("\nLista de Filmes");
			System.out.println("\n1 - A procura da felicidade");
			System.out.println("\n2 - Os vingadores");
			System.out.println("\n3 - Prenda-me se for capaz");
			System.out.println("\n4 - A ilha do medo");
			System.out.println("\nDigite a sua opção: ");
			op = leia.nextInt();
			switch(op) { //switch="caso"
			case 1:
				System.out.println("\nA procura da felicidade");
				break;
			case 2:
				System.out.println("\nOs vingadores");
				break;
			case 3:
				System.out.println("\nPrenda-me se for capaz");
				break;
			case 4:
				System.out.println("\nA ilha do medo");
				break;
				default: //casocontrário
					System.out.println("\nOpção inválida!!!");
			}
			nota1 = Math.sqrt(nota2); //chamando a raiz quadrada
			nota2 = Math.pow(nota3, 3); //chamando a pontencia, o num 3 representa o expoente, ou seja, a terceira potencia
			
			}
}
