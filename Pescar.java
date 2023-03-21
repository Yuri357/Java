import java.util.Scanner;

public class Pescar {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um numero : ");
		int n1 = entrada.nextInt();
		
		System.out.println("Informe um numero");
		int n2 = entrada.nextInt();
		
		if (n1 > n2) {
			System.out.println(n1 + " é maior que " + n2);
		}else {
			if (n2 > n1) {
				System.out.println(n2 + " é maior que " + n1);
				
			}else {
				System.out.println("São iguais");
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
