import java.util.Scanner;

public class OpLogc {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" Escreva o seu primeiro número: ");
		int valor1 = entrada.nextInt();
				
		System.out.println(" Escreva o seu segundo número: ");		
		int valor2 = entrada.nextInt();
		
		if (valor1 > valor2) {
			
			System.out.println(valor1 + "   É maior que " + valor2);
			
		}else {
			
			System.out.println(valor1 + "   É menor que " + valor2);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
