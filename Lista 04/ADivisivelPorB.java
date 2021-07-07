import java.util.Scanner;

public class ADivisivelPorB {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double a=0,b=0;
		
		System.out.println("Valor do produto 1: ");
		a=leia.nextInt();
		System.out.println("Valor do produto 1: ");
		b=leia.nextInt();
		
		if((a%b)==0)
		System.out.print("\nEh divisivel: "+(a%b));
		
		if((a%b)!=0)
		System.out.print("\nNaum eh divisivel: "+(a%b));
		
	}
}

