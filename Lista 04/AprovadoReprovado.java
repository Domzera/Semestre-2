//import java.util.Random;
import java.util.Scanner;

public class AprovadoReprovado {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int entrada=0;
		
		System.out.println("Digite uma nota");
		entrada=leia.nextInt();
		
		if(entrada>6)
		System.out.print("\nAprovado - nota: "+entrada);
		
		if(entrada<=6)
		System.out.print("\nReprovado - nota"+entrada);
		
		
	}
}

