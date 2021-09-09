// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int numero;
	    
	    System.out.println("Digite o número: ");
	    numero = sc.nextInt();
	    sc.close();
	    
	    if (numero < 0){
	        System.out.printf("Esse número é negativo.");
	    } else {
	        System.out.printf("Esse número é positivo.");
	    }
	
	}
}
