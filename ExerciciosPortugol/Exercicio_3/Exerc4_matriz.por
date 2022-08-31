programa
{
	/* 4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/ 
	funcao inicio()
	{
		inteiro matriz[3][3],somaValor=0, somaDiagonal=0 ,i,j

		para(i=0;i<3;i++)
		{
			para(j=0;j<3;j++)	
			{
				escreva("\nEntre com os valores da matriz: ")	
				leia(matriz[i][j])
				somaValor += matriz[i][j]

				se(i == j) //se as duas tiverem o mesmo valor, executa
				//(quando o i for igual ao j soma, ou seja, somaDiagonal = somaDiagonal + matriz[i][j])
				{
					somaDiagonal += matriz[i][j]
				}
			}
		}
		escreva("\nEscreva somatório dos valores da matriz: ",somaValor)
		escreva("\nSomatório da minha diagonal principal: ",somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 645; 
 * @PONTOS-DE-PARADA = 8, 14, 15;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */