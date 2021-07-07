import java.util.Scanner;

public class Lista05Exerc01 {
	
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int valor=0;
		
		System.out.println("Digite um numero");
		valor=sc.nextInt();
		
		if(valor>10){
			System.out.print("Eh maior que 10");
		}else{System.out.print("Nau eh maior que 10");}
	}
}

