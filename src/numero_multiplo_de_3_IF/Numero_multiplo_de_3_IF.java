package numero_multiplo_de_3_IF;

import java.util.Scanner;

public class Numero_multiplo_de_3_IF {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int numero = input.nextInt();
		
		if (numero %3 == 0 ) {
			System.out.println(numero + " é um número multiplo de 3.");
		}else {
			System.out.println(numero + " não é um número multiplo de 3.");
		}
	}

}
