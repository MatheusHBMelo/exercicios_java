import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String nome;
	    
		System.out.println("Digite o nome da empresa: ");
		nome = sc.next();
		
		switch (nome){
		    case "RedBull":
		        System.out.println("Max Verstappen e Sergio Perez");
		        break;
		    case "Mercedes":
		        System.out.println("Lewis Hamilton e Valteri Bottas");
		        break;
		    case "Mclaren":
		        System.out.println("Lando Norris e Daniel Ricciardo");
		        break;
		    case "Ferrari":
		        System.out.println("Charles Leclerc e Carlos Sainz");
		        break;
		    case "AstonMartin":
		        System.out.println("Sebastian Vettel e Lance Stroll");
		        break;
		    case "Alpine":
		        System.out.println("Fernando Alonso e Esteban Occon");
		        break;
		    case "AlphaTauri":
		        System.out.println("Pierry Gasly e Yuki Tsunoda");
		        break;
		    case "AlphaRomeo":
		        System.out.println("Kimi Raikkonen e Antonio Giovinazzi");
		        break;
		    case "Haas":
		        System.out.println("Mick Schumacher e Nikita Mazepin");
		        break;
		    case "Willian":
		        System.out.println("George Russell e Nicholas Latifi");
		        break;
		    default:
		        System.out.println("Digite uma equipe valida!");
		        break;
		}
	}
}
