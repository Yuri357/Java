package exercito;

import java.util.Scanner;

public class Medias20 {

	public static void main(String[] args) {
		
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println(" Digite o Valor 1 ");
			int valor1 = entrada.nextInt();
			
			System.out.println(" Digite o Valor 2 ");
			int valor2 = entrada.nextInt();
			
			int soma = (valor1 + valor2);
			System.out.println(" Resultado dos Valores "+ soma );
			
			if (soma > 20) {
				System.out.println(" O resultado : " + (soma + 5));
			} else {
				int valor = soma * 8;
				System.out.println(" O resultado : " + valor );
				
			}
			
			
			
	}

}
