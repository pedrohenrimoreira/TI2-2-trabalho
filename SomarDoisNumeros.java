package UNIDADE01;
import java.util.Scanner;

class SomarDoisNumeros {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		//Declaracao de variaveis
		
		int num1,num2,soma;
		//Leitura
		
		System.out.println("Digite um número: ");
		num1 = sc.nextInt();
		System.out.println("Digite um outro número: ");
		num2 = sc.nextInt();
		//Somar
		
		soma = num1 + num2;
		//mostrar na tela
		
		System.out.println("Soma:"+soma);
	}
	
	
	
	
	
}
