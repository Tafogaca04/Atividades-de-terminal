package Case;

import java.util.Scanner;

public class Atividade21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);

		System.out.println("Escolha im nuúmero entre 1 a 4");
		int numero = ler.nextInt();

		switch (numero) {
		case 1:
			System.out.println("O número escolhido foi: 1");
			break;


		case 2:
			System.out.println("O número escolhido foi: 2");
			break;

		case 3:
			System.out.println("O número escolhido foi: 3");
			break;

		case 4:
			System.out.println("O número escolhido foi: 4");
			break;
			
			
			
		default:
			System.out.println("O número escolhido foi invalidado.Digite novamente um número  de 1 a 4");

		}

	}

}
