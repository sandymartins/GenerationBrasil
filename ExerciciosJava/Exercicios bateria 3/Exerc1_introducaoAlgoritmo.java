package Familia57;

import java.util.Scanner;
public class Exerc1_introducaoAlgoritmo{

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);

	int anos, meses, dias, diastotais;

		System.out.println("Entre com quantos dias de vida você possui até a data de hoje: ");
			diastotais = ler.nextInt();
		
			anos = diastotais/365;
			meses = 30%anos;
			dias = (diastotais%365)%30;
					
	
	System.out.println("Parabéns você possui: "+ anos + " Anos " + meses + " Meses e " + dias + " dias!!!");


}
}