import java.util.Scanner;

public class OpLogc {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" Escreva o seu primeiro n�mero: ");
		int valor1 = entrada.nextInt();
				
		System.out.println(" Escreva o seu segundo n�mero: ");		
		int valor2 = entrada.nextInt();
		
		if (valor1 > valor2) {
			
			System.out.println(valor1 + "   � maior que " + valor2);
			
		}else {
			
			System.out.println(valor1 + "   � menor que " + valor2);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
