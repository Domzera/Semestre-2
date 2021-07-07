import java.util.Random;
//import java.util.Scanner;

public class ADivisivelPorBRandom {
	
	public static void main (String[] args) {
		//Scanner leia = new Scanner(System.in);
		Random rnd = new Random();
		
		double a=0,b=0;
		
		a=rnd.nextInt(1001);
		b=rnd.nextInt(21);
		
		//System.out.println("Valor do produto 1: ");
		//produto1=leia.nextInt();
		
		System.out.print(a+"  "+b);
		
		if((a%b)==0)
		System.out.print("\nEh divisivel: "+(a%b));
		
		if((a%b)!=0)
		System.out.print("\nNaum eh divisivel: "+(a%b));
		
	}
}

