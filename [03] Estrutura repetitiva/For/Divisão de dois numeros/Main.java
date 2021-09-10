import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de divisões: ");
		int n = sc.nextInt();
		
		for (int i=0; i < n; i++){
		    System.out.println("Digite os dois números: ");
		    double a = sc.nextDouble();
		    double b = sc.nextDouble();
		    
		    
		    double div = a / b;
		    
		    if (b == 0) {
		        System.out.println("Divisão impossivel!");
		    }else {
		        System.out.printf("Divisão: %.2f %n", div);
		    }
		}
		sc.close();
	}
}