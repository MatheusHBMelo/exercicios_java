import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int a, b;
	    
		System.out.println("Digite o valor de A e B");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0){
		    System.out.println("São multiplos");
		} else {
		    System.out.println("Não são multiplos");
		}
		sc.close();
	}
}
