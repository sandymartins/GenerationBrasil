programa
{
		/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
		dias e mostre-a expressa apenas em dias.
		*/ 
	funcao inicio()
	{
		inteiro anos,meses,dias,totaldias
		
		escreva("Quantos dias você tem? ")
		leia(totaldias)

		anos = totaldias/365
		dias = totaldias%365
		meses = totaldias/30
		totaldias = totaldias%30
		totaldias = totaldias
		
		escreva("\nA idade é: ",anos)
		escreva("\nA quantidade de meses é: ",meses)
		escreva("\nA quandidade de dias é: ",dias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 135; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */