package Operador.Ternário;

import java.util.Scanner;

public class Atividade25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade;
		Scanner ler = new Scanner (System.in);
		System.out.println("Informe o número de sua idade");
		idade = ler.nextInt();
		String mensagem = idade >= 18 ? "Maior de idade" : "Menor de idade";
		System.out.println(mensagem) ; //Imprime "Maior da idade"
	}

}
