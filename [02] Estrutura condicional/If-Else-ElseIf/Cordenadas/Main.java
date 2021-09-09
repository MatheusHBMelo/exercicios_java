import java.util.Scanner;
import java.util.Locale;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Locale.setDefault(Locale.US);
	    
	    double x, y;
	    
	    System.out.println("Digite o valor das duas cordenadas: ");
	    x = sc.nextDouble();
	    y = sc.nextDouble();
	    
	    if (x == 0.0 && y == 0.0){
	        System.out.println("Origem");
	    } else if (x == 0.0){
	        System.out.println("Eixo X");
	    } else if (y == 0.0){
	        System.out.println("Eixo Y");
	    } else if (x < 0.0 && y > 0){
	        System.out.println("Segundo quadrante");
	    } else if (x < 0.0 && y < 0){
	        System.out.println("Terceiro quadrante");
	    } else if (x > 0.0 && y < 0){
	        System.out.println("Quarto quadrante");
	    } else {
	        System.out.println("Primeiro quadrante");
	    }
	   
	    sc.close();
	}
}
