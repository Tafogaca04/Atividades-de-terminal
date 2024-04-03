package Case;

import java.util.Scanner;

public class Atividadw12 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner (System.in);
		double nota1, nota2, nota3, nota4,media;

		System.out.print("Informe o nota1:");
		nota1= ler .nextInt();

		System.out.print("Informe o nota2:");
		nota2= ler .nextInt();

		System.out.print("Informe o nota3:");
		nota3= ler .nextInt();

		System.out.print("Informe o nota4:");
		nota4= ler .nextInt();


		media = (nota1+nota2+nota3+nota4)/4;
		

		if (media >=6) {
			System.out.println("A nota é aprovada"+ media);
		}
		else if ( media < 4) {
			System.out.println("Recuperação"+ media);
		}

		else {
			System.out.println("A nota  é reprovada"+media);

			ler.close();
		}
	}
}

