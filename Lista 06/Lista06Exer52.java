import java.util.Scanner;

public class Lista06Exer52 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int entrada=0,controle=1,a=0,b=0,c=1,d=0;
		
		System.out.println("Digite um numero para varificar.");
		entrada=sc.nextInt();
		
		while(entrada>=controle){
			
			if(b==entrada)d=1;
			System.out.print(b+" ");
			a=b;
			b=a+c;
			c=a;
			
			controle++;
		
		}
		
		if(d==1)System.out.print("\nPertence a sequencia Fibonacci.");
		
		else System.out.print("\nNao pertence a sequencia Fibonacci!");
	}
}
