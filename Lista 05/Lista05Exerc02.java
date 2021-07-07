import java.util.Scanner;

public class Lista05Exerc02 {
	
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int valor=0;
		
		System.out.println("Digite um numero");
		valor=sc.nextInt();
		
		if(valor%2>0){
			System.out.print("Eh impar ");
		}else{System.out.print("Eh par ");}
	}
}

