/*
Leia 2 valores inteiros X e Y. A seguir, calcule e 
mostre a soma dos números impares entre eles.

Entrada
O arquivo de entrada contém dois valores inteiros.

Saída
O programa deve imprimir um valor inteiro. 
Este valor é a soma dos valores ímpares que estão 
entre os valores fornecidos na entrada que deverá 
caber em um inteiro.
 */

package lista3LacosRepeticao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int x, y, soma = 0;
        
        x = leia.nextInt();
        y = leia.nextInt();
        
        if(x <= y){
            for(int i = (x+1); i < y; i++){
                if(i%2 != 0)
                    soma += i;
            }
        } else {
            for(int i = (y+1); i < x; i++){
                if(i%2 != 0)
                    soma += i;
            }
        }
        
        System.out.println(soma);

	}
}
