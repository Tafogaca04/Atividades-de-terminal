package Operador.Ternário;
import java.util.Scanner;

public class Atividade28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a;
		Scanner ler = new Scanner (System.in);
		System.out.print("Informe um valor");
		a = ler.nextDouble();
		
		
		
		String mensagem = a  % 5  == 0 ? " é multiplo de 5" : " não é multiplo de 5";
		System.out.println(mensagem) ; 
		
}
}
