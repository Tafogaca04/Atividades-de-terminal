package Operador.Ternário;

import java.util.Scanner;

public class Atividade29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		double salario,tempo,bonus1,bonus2;
	   
		
		System.out.print("Informe o seu salário:");
		salario= ler .nextDouble();
		
		System.out.print("Informe o seu tempo:");
		tempo= ler .nextDouble();
		
		bonus1 = (salario*0.07);
		bonus2 = (salario *0.05);

		if (tempo <= 3) {
			System.out.println("Você ganhou um bônus de 5%"+ bonus2);
		}
		else {
			System.out.println("Você ganhou um bônus de 7%" + bonus1);
		}
	ler.close();
	}

}
