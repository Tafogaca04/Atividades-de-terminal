package Operador.Ternário;

import java.util.Scanner;

public class Atividade27 {


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
		String mensagem = media >= 6 ? "Nota aprovada" : "Reprovado";
		System.out.println(mensagem) ; //Imprime "Média"
		
		

			ler.close();
		}
	}


