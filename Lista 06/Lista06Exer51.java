import java.util.Scanner;

public class Lista06Exer51 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int entrada=0,controle=1,a=0,b=0,c=1;
		
		System.out.println("Quantos elementos de fibonacci voce quer.");
		entrada=sc.nextInt();
		
		while(entrada>=controle){
		
			System.out.print(b+" ");
			a=b;
			b=a+c;
			c=a;
			
			controle++;
		
		}
	
	}
}

