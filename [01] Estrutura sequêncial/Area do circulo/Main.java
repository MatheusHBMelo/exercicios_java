import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double area, raio;
		double pi = 3.14159;

		System.out.println("Digite o valor do raio: ");
		raio = sc.nextDouble();
		sc.close();

		area = pi * Math.pow(raio, 2);

		System.out.printf("A = %.4f ", area);
	}
}
