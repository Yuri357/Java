import java.util.Scanner;

public class Gasolina {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Fala teu combustivel meu patrão: ");
		String combustivel = entrada.nextLine();
		
		System.out.println("Informe a capacidade do tanque : ");
		double cT = entrada.nextDouble();
		
		if(combustivel.equalsIgnoreCase("G")) {
			double valorPago = cT * 3.79;
			System.out.println("O valor pago na Gasolina: " + valorPago);			
		}else {
			double valorPago = cT * 2.90;
			System.out.println("O valor pago no Alcool: " + valorPago);	
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
