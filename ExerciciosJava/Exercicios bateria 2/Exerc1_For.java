package Familia57;
	/* Informar todos os números de 1000 a 1999 que quando divididos por 11
	obtemos resto = 5. (FOR)*/
public class Exerc1_For {

	public static void main(String[] args) {
		
			int a=1000;
			
			for(a=1000; a<=1999; a++) { //Looping para determinar quando vai começar e finalizar
				if (a%11==5) {			//se houver RESTO da DIVISÃO IGUAL a 5
					System.out.println(a);
				}
			}
	}

}
