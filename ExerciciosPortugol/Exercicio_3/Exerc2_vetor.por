programa
{
/* 2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/
	
	funcao inicio()
	{
		inteiro lancamento[10],somaLanc=0,maiorValor=0,maior=0,x,contMaior=0
		real mediaLanc

		para(x=0;x<10;x++)
		{
			escreva("\nLancamento: ")	
			leia(lancamento[x])
			somaLanc += lancamento[x] //somando todos os lançamentos.

			se(lancamento[x] == 6) //considerando que o maior lancamento é 6, eu uso o == para verificar e armazendo todos que forem igual (==) a 6.
			{
				maiorValor++ //somando um a cada passagem (maiorValor = maiorValor + 1) ISSO VAI CONTAR A QUANTIDADE DE VEZES QUE CAIU O NÚMERO 6
			}

			//ou 
			se(maior<lancamento[x]) //VERIFICANDO QUAL É O MAIOR DE TODOS
			{
				maior = lancamento[x]	//VAI CONTAR A QUANIDADE DE VEZES QUE O MAIOR NÚMERO APARECEU.
			}
		}
		para(x=0;x<10;x++)
		{
			se(maior == lancamento[x])	
			{
				contMaior++	
			}
		}
		mediaLanc = somaLanc / 10
		escreva("\nMédia dos lanmentos: ", mediaLanc)
		escreva("\nQuantidade de vezes que apareceu o maior valor sendo o 6: ", maiorValor)
		escreva("\nQuantidade de vezes que apareceu o maior valor: ", contMaior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1010; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */