// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int numero;
	    
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		sc.close();
		
		if (numero % 2 == 0){
		    System.out.println("O número é par.");
		} else {
		    System.out.println("O numero é impar.");
		}
		
	}
}
