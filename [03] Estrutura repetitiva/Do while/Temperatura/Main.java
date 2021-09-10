import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

        char resp;
		do {
		    System.out.print("Digite a temperatura em celcius: ");
		    Double C = sc.nextDouble();
		    
		    Double F = 9.0 * C / 5.0 + 32.0;
		    
		    System.out.printf("Equivalente em Fahrenheint: %.1f %n", F);
		    
		    System.out.print("Deseja repetir (s/n)? ");
		    resp = sc.next().charAt(0);
		    
		} while (resp == 's');
		
		sc.close();
	}
}