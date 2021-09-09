// Fazer um programa para ler quatro valores inteiros A, B, C e D.
// Calcule e mostre a diferença do produto de A e B pelo produto de C e D

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1, n2, n3, n4, dif;

		System.out.println("Digite o primeiro número:");
		n1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o segundo número:");
		n2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o terceiro número:");
		n3 = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o quarto número:");
		n4 = sc.nextInt();
		sc.nextLine();
		sc.close();

		dif = (n1 * n2 - n3 * n4);

		System.out.printf("Diferença: %d", dif);
	}
}
