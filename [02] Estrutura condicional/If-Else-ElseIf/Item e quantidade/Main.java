import java.util.Scanner;
import java.util.Locale;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Locale.setDefault(Locale.US);
	    
	    int number, quantidade;
	    double total;
	    
	    System.out.println("Escolha qual produto deseja comprar: ");
	    System.out.println("1 - Cachorro quente");
	    System.out.println("2 - X-salada");
	    System.out.println("3 - X-bacon");
	    System.out.println("4 - Torrada simples");
	    System.out.println("5 - Refrigerante");
	    number = sc.nextInt();
	    
	    System.out.printf("Digite a quantidade de itens: ");
	    quantidade = sc.nextInt();
	    
	    if (number == 1){
	        total = quantidade * 4.00;
	    } else if (number == 2){
	        total = quantidade * 4.50;
	    } else if (number == 3){
	        total = quantidade * 5.00;
	    } else if (number == 4){
	        total = quantidade * 2.00;
	    } else {
	        total = quantidade * 1.50;
	    }
	    
	    System.out.printf("TOTAL: R$%.2f", total);
	    
	    sc.close();
	}
}
