programa
{
		/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
		expressa em anos, meses e dias.*/

	funcao inicio()
	{
		inteiro anos, meses, dias, total

		//dados de entrada
		escreva("Quantos anos você tem? ")
		leia(anos)
		escreva("Quantos meses desde o seu aniversário? ")
		leia(meses)
		escreva("Que dia é hoje? ")
		leia(dias)
		limpa()

		//dados de processamento
		total = (dias+(meses*30)+(anos*365))

		//dados de saída
		escreva("O total de dias é: ",total)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 463; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */