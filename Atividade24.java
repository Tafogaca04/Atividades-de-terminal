package Case;

import java.util.Scanner;

public class Atividade24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		String dia;
		
      System.out.println("Informe o dia da semana");
		dia = ler.next();

		switch (dia) {
		case ("Domingo"):
			System.out.println("1° dia da semana");
			break;

		case ("Segunda"):
			System.out.println("2° dia da semana");
			break;

		case ("Terça"):
			System.out.println("3° dia da semana");
			break;
		case ("Quarta"):
			System.out.println("4° dia da semana");
			break;
		case ("Quinta"):
			System.out.println("5° dia da semana");
			break;
		case ("Sexta"):
			System.out.println("6° dia da semana");
			break;
		case ("Sábado"):
			System.out.println("7° dia da semana");
			break;

		default:
			System.out.print("O dia da semana inválidado.Digite novamente!");


		}
	}

}
