// Faça um programa que leia três valores com ponto flutuante de dupla precisão
// A, B e C em seguida, calcule e mostre:
// 01- a área do triângulo retângulo que tem A por base e C por altura.
// 02- a área do círculo de raio C. (pi = 3.14159)
// 03- a área do trapézio que tem A e B por bases e C por altura.
// 04- a área do quadrado que tem lado B.
// 05- a área do retângulo que tem lados A e B.

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		double a, b, c, pi;
		pi = 3.14159;

		System.out.println("Digite o valor de A, B e C:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		sc.nextLine();
		sc.close();

		areaTriangulo = a * c / 2;
		areaCirculo = pi * Math.pow(c, 2);
		areaTrapezio = ((a + b) * c) / 2;
		areaQuadrado = b * b;
		areaRetangulo = a * b;

		System.out.printf("TRIÂNGULO: %.3f %n", areaTriangulo);
		System.out.printf("CÍRCULO: %.3f %n", areaCirculo);
		System.out.printf("TRAPÉZIO: %.3f %n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f %n", areaQuadrado);
		System.out.printf("RETÂNGULO: %.3f %n", areaRetangulo);
	}
}
