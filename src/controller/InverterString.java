/*
a- A condição de parada ocorre quando o valor de “qtd” é igual a 0.
b- Para chegar ao resultado do texto invertido utilizando a função de “subtring”
 precisamos obter a última posição do caractere da variável “texto”. Através do 
 “length” é possível obter esse valor e definir o range em que a função “subtring” 
 irá trabalhar, no processo de decrementar o valor de “qtd” em cada iteração do 
 programa o mesmo armazena em "texto" e passa para o novo valor de “qtd”. 
 Com isso, exibe o valor final e ao chegar no valor = 0 ele entra para condição 
 de parada.

 */
package controller;

public class InverterString {
	public String inversor (String texto, int qtd) {
		if (qtd == 0) {
			return "";
		}
		else {
			return texto.substring(qtd - 1, qtd) + inversor(texto, qtd - 1);
		}
	}
}