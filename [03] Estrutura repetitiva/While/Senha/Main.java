import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.printf("Digite a senha: ");
		int senha = sc.nextInt();
		
		while (senha != 2002){
		    System.out.println("SENHA INVALIDA");
		    senha = sc.nextInt();
		}
		System.out.println("Acesso permitido");
	}
}
