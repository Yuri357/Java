import java.util.Scanner;

public class FPBVAGA {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o seu nome");
		String nome = entrada.nextLine();
		
		System.out.println(" Informe o seu sal�rio: ");
		double salario = entrada.nextDouble();
		
		double salarioDesconto = (salario * 30) / 100;
		
		System.out.println(" Informe a presta��o: ");
		double prestacao = entrada.nextDouble();
		
		if (prestacao < salarioDesconto) {
			
			System.out.println( nome + " Sua presta��o foi Autorizado " );

		}else {
			System.out.println(nome + " Sua presta��o n�o foi Autorizado " );

		}
			
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
