package Case;

import java.util.Scanner;

public class Atividade23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler =  new Scanner(System.in);
		int mês;

		System.out.println("Informe o número de 1 a 12:");
		mês = ler.nextInt();

		switch (mês){
		case 1:
			System.out.println("Janeiro: 1° mês do ano");
			break;
		case 2:
			System.out.println("Fevereiro: 2°mês do ano");
			break;

		case 3:
			System.out.println("Março: 3°mês do ano");
			break;

		case 4:
			System.out.println("Abril: 4°mês do ano");
			break;

		case 5:
			System.out.println("Maio: 5°mês do ano");
			break;
		case 6:
			System.out.println("Junho: 6°mês do ano");
			break;
		case 7:
			System.out.println("Julho: 7°mês do ano");
			break;

		case 8:
			System.out.println("Agosto: 8°mês do ano");
			break;

		case 9:
			System.out.println("Setembro: 9°mês do ano");
			break;

		case 10:
			System.out.println("Outubro: 10°mês do ano");
			break;
		case 11:
			System.out.println("Novembro:11°mês do ano");
			break;
		case 12:
			System.out.println("Dezembro: 12°mês do ano");
			break;

		default:
			System.out.print("O mês está inválidado.Digite novamente!");

		}

	}
}
