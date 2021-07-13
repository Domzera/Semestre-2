import java.util.Scanner;

public class Lista06Exer46 {
	
	public static void main (String[] args) {
		Scanner leia=new Scanner(System.in);
		
		int entrada=0,contador=0;
		
		System.out.println("\ndigite um valor");
		entrada=leia.nextInt();
		
		for(int i=entrada;i>=1;i--){
			
			if(entrada%i==0){
				contador++;
			}	
		}
		
		if(contador==2)
			System.out.print("Eh primo ");
		else System.out.print("Nau eh primo");
		
	}
}

