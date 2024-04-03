package Case;

import java.util.Scanner;

public class Atividade22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		int dia;
		
      System.out.println("Informe o dia da semana");
		dia = ler.nextInt();

		switch (dia) {
		case 1:
			System.out.println("Domingo: 1° dia da semana");
			break;

		case 2:
			System.out.println("Segunda:2° dia da semana");
			break;

		case 3:
			System.out.println("Terça:3° dia da semana");
			break;
		case 4:
			System.out.println("Quarta:4° dia da semana");
			break;
		case 5:
			System.out.println("Quinta:5° dia da semana");
			break;
		case 6:
			System.out.println("Sexta:6° dia da semana");
			break;
		case 7:
			System.out.println("Sábado:7° dia da semana");
			break;

		default:
			System.out.print("O número escolhido foi invalidado.Digite novamente para determinar o dia da semana");


		}
	}

}
