programa
{
	
	funcao inicio()
	{
		real numero,somaNum=0.0,mediaNum=0.0
		inteiro quantNum=0

		escreva("\nEntre com um número: ")
		leia(numero)

		enquanto(numero>=0)
		{
			somaNum += numero
			quantNum++ // quantNum = quantNum + 1
			escreva("\nEntre com um número: ")
			leia(numero)
		}
		se(quantNum!=0)
		{
			mediaNum = somaNum / quantNum
		}
		senao
		{
			escreva("\nNão é possível fazer divisão por zero!!!")
		}
		escreva("\nSomatório dos números lidos: ",somaNum)
		escreva("\nQuantidade de números lidos: ",quantNum)
		escreva("\nMédia dos números lidos: ",mediaNum)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 589; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */