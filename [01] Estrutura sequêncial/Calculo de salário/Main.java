import java.util.Scanner;
import java.util.Locale;

public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    int numeroFunc; 
	    double horasTrabalhadas, valorHora, salario;
	    
	    System.out.println("Digite o número do funcionário: ");
	    numeroFunc = sc.nextInt();
	    sc.nextLine();
	    
	    System.out.println("Digite a quantidade de horas trabalhadas: ");
	    horasTrabalhadas = sc.nextDouble();
	    sc.nextLine();
	    
	    System.out.println("Digite o valor da hora trabalhada: ");
	    valorHora = sc.nextDouble();
	    sc.nextLine();
	    sc.close();
	    
	    salario = horasTrabalhadas * valorHora;
	    
		System.out.printf("Number: %d %n", numeroFunc);
		System.out.printf("Salary: U$%.2f", salario);
	}
}
