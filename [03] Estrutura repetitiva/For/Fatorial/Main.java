import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número que quer calcular: ");
		int n = sc.nextInt();
		
		int fat = 1;
		for (int i=1; i<=n; i++) {
			fat = fat * i;
		}
		
		System.out.printf("O fatorial de %d = %d", n, fat);
		
		sc.close();
	}
}