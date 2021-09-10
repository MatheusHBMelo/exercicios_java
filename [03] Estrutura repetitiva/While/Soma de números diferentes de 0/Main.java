import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int soma = 0;
	    
		System.out.println("Digite números, quando quiser parar digite 0");
		int x = sc.nextInt();
		
		while (x != 0 ){
		    soma += x;
		    x = sc.nextInt();
		}
		
		System.out.printf("A soma dos números digitados é: %d", soma);
	}
}
