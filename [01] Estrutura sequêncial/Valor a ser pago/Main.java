// Ler o código de uma peça 1, o número de peças, o valor unitário de cada peça
// o código de uma peça 2, o número de peças e o valor unitário de cada peça

import java.util.Scanner;
import java.util.Locale;

public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    int codPeca1, codPeca2, numeroPeca1, numeroPeca2;
	    double valorUnitario1, valorUnitario2, valorTotal;
	    
	    System.out.println("Digite o código, quantidade e preço da peça1: ");
	    codPeca1 = sc.nextInt();
	    numeroPeca1 = sc.nextInt();
	    valorUnitario1 = sc.nextDouble();
	    sc.nextLine();
	    
	    System.out.println("Digite o código, quantidade e preço da peça2: ");
	    codPeca2 = sc.nextInt();
	    numeroPeca2 = sc.nextInt();
	    valorUnitario2 = sc.nextDouble();
	    sc.nextLine();
	    sc.close();
	    
	    valorTotal = valorUnitario1 * numeroPeca1 + valorUnitario2 * numeroPeca2;
	    
		System.out.printf("VALOR A PAGAR: R$%.2f", valorTotal);
	}
}
