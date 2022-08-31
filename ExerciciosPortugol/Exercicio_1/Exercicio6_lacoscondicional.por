programa
{
	// Elabore um programa que, dada a idade de um nadador, classifique-o em uma das
	// seguintes categorias:
	// infantil A = 5 - 7 anos
	// infantil B = 8 - 10 anos
	// juvenil A = 11 - 13 anos
	// juvenil B = 14 - 17 anos
	// sênior = maiores de 17 anos
	funcao inicio()
	{
		inteiro idade
		escreva("Informe a idade do nadador: ")
		leia(idade)
		se(idade < 5){
			escreva("\nSem classificação!")}
			
		senao se(idade <= 7){
			escreva("\nInfantil A")}
			
		senao se(idade <= 10){
	       		escreva("\ninfantil B")}
	       		
	    	senao se (idade <= 13){
		    escreva("\njuvenil A")}	  
		      
		senao se (idade <= 17){
			 escreva("\njuvenil B")}
			 
		senao{
			 escreva("\nsênior")}
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 677; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */