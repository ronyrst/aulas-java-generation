/*
Leia um número inteiro que representa um código de DDD para discagem interurbana.
Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:

Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, 
o programa deverá informar: DDD nao cadastrado
 */

package lista2LacosCondicionais;

import java.util.Scanner;

public class Exercicio1 {

	 public static void main(String[] args) {
	    int codigo;
	    Scanner leia = new Scanner(System.in);
	    
	    codigo = leia.nextInt();
	    
	    switch(codigo){
	        case 61:
	            System.out.println("Brasilia");
	            break;
	        case 71:
	        	System.out.println("Salvador");
	        	break;
	        case 11:
	        	System.out.println("Sao Paulo");
	        	break;            
	        case 21:
	        	System.out.println("Rio de Janeiro");
	        	break;  
			case 32:
			    System.out.println("Juiz de Fora");
			    break;
			case 19:
			    System.out.println("Campinas");
			    break;
			case 27:
			    System.out.println("Vitoria");
			    break;
			case 31:
			    System.out.println("Belo Horizonte");
			    break;
			default:
			    System.out.println("DDD nao cadastrado");
	            break;
	    }
	 }
}
