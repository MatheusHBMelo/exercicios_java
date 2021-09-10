// Faça um programa para ler dois números inteiros 
// E mostrar na tela a soma entre esses números

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n1;
	    int n2;
	    int soma;
	    
	    System.out.println("Digite o primeiro valor: ");
	    n1 = sc.nextInt();
	    sc.nextLine();
	    
	    System.out.println("Digite o segundo valor: ");
	    n2 = sc.nextInt();
	    sc.nextLine();
	    sc.close();
	    
	    soma = n1 + n2;
	    
	    System.out.printf("Soma = %d", soma);
	    
	}
}
