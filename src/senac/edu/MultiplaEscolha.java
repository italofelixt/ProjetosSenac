package senac.edu;

import java.util.Scanner;

public class MultiplaEscolha {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int contador = 1 ;
		boolean taCerta = false;
		
		System.out.println("O valor em bin�rio do decimal 42 �: ");
		System.out.println("");
		System.out.println("a) 101010");//respota correta
		System.out.println("b) 101011");
		System.out.println("c) 111010");
		System.out.println("d) 101110");
		System.out.println("e) 101111");
		
		System.out.println("\nVoc� tem 3 tentativas.\n");
		
		do {
			
			System.out.print("Digite a alternativa: ");	
		
			String alternativa = ("");
			alternativa = sc.next();
			
			
			switch (alternativa.toUpperCase()) {
			
				
				
				case "A":
					System.out.println("\nResposta correta!\n\nParab�ns! =)");
					/* Poderia usar um contador-- para zerar-lo
					 *  e no while colocar contador == 0 
					 *  no lugar do taCerta != true
					 */
					
					taCerta = true;
					break;
				
				case "B":
					System.out.println("\nTentativa n�:" + contador + "\n\nResposta incorreta\n");
					contador++;
					break;
				
				case "C":
					System.out.println("\nTentativa n�:" + contador + "\n\nResposta incorreta\n");
					contador++;
					break;
				
				case "D":
					System.out.println("\nTentativa n�:" + contador + "\n\nResposta incorreta\n");
					contador++;
					break;
				
				case "E":
					System.out.println("\nTentativa n�:" + contador + "\n\nResposta incorreta\n");
					contador++;
					break;
			
				default:
					System.out.println("\nResposta inv�lida\n");
			}	
						
		}while( taCerta != true && contador <= 3 );
		
		if (contador >= 3) {
			System.out.println("Acabaram suas tentativas =(");
		}
		
		sc.close();
	}
	
}
