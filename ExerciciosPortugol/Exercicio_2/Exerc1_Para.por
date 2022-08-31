programa
{
/* 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,   
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população;										
b) média do número de filhos;											
c) maior salário;													
d) percentual de pessoas com salário até R$100,00. 
							USANDO A ESTRUTURA FOR
*/
	
	funcao inicio()
	{
		real x,mediaFilho = 0.0 , salario = 0.0 ,mediaSal = 0.0 ,maiorSal = 0.0 ,porcSal = 0.0 ,totalSal = 0.0 ,filhos = 0.0 ,totalFilhos = 0.0
		 
		para(x = 1.0; x <= 20; x++)//x++ x = x + 1 x=1(ponto inicial)x<=20(quandidade de habitantes)x++(aumento o laço de 1 em 1)
		{
			escreva("\nQuantos filhos você tem: ")//supondo que se tenha 1 filho
			leia(filhos)
			escreva("\nInforme o seu salário: ")//supondo que o salário é 100 reais
			leia(salario)
			limpa()
			
			totalSal+=salario //totalSal = totalSal + salario 	      ARMAZENA OS DADOS
			
			totalFilhos+=filhos //totalFilhos = totalFilhos + filhos     ARMAZENA OS DADOS

			se (salario > maiorSal) //CALCULA O MAIOR SALÁRIO, SE FOR VERDADEIRO.
			{
				maiorSal = salario //REGISTRA O MAIOR SALÁRIO 
			}
			
			se (salario < 100)//CALCULA O PERCENTUAL DE PESSOAS COM SALÁRIO ATÉ 100.
			{
				porcSal++ //porcSal = porcSal + 1 CONTA A PESSOA E PASSA PARA O PRÓXIMO.
			}
			escreva("\nFormulário respondido, muito obriagada!")
			
		}
		
		mediaFilho = totalFilhos / 20 //CALCULANDO A MÉDIA
		mediaSal = totalSal / 20     //CALCULANDO A MÉDIA

			escreva("\nO salário médio é: ", mediaSal)  
			escreva( "\nA média de filhos é: " ,mediaFilho)
			escreva( "\nO maior salário é: " ,maiorSal)
			escreva( "\nO percentual de pessoas com salário até R$100,00 é: " ,( (porcSal) / 20 ) * 100 ," %") /* VARIÁVEL porcSal 
																							CONTA A QUANTIDADE
																							DE PESSOAS COM SALÁRIO
																							ABAIXO DE 100 E DIVIDE 
																							PELA QUANTIDADE DE HABITANTES,
																							DEPOIS MULTIPLICA O VALOR 
																							POR 100 E TERÁ A PORCENTAGEM.
																							*/

		}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 562; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */