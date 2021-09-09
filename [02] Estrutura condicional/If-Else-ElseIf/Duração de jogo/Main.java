import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int horaInicial, horaFinal, duracao;
	    
		System.out.println("Digite o valor da hora inicial e final");
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if (horaInicial < horaFinal){
		    duracao = horaFinal - horaInicial;
		} else {
		    duracao = 24 - horaInicial + horaFinal;
		}
		sc.close();
		
		System.out.printf("O JOGO DUROU %d HORA(S).", duracao);
	}
}
