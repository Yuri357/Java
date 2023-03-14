package exercito;

import java.util.Scanner;

public class Medias {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o seu nome");
		String nome = entrada.nextLine();
		
		
		System.out.println("Informe sua primeira nota  ");
		double nota1 = entrada.nextDouble();
		
		
		System.out.println("Informe sua segunda nota  ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2)/ 2 ;
		System.out.println("Média Geral " + media);
		
	
		
	
		if (media >=7) {
			System.out.println(nome + " Esta Aprovado!! ");
		}else {
			System.out.println(nome + " Esta Recuperação  ");
		}
		

	}

}
