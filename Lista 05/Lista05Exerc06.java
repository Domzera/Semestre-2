import java.util.Scanner;

public class Lista05Exerc06 {
	
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int valor1=0,valor2;
		
		System.out.println("Digite um valor");
		valor1=sc.nextInt();
		System.out.println("Digite outro valor");
		valor2=sc.nextInt();
		
		if(valor1>valor2){
			System.out.printf("O primeiro valor, %.0f, eh maior",(float)valor1);
		}else{
			System.out.printf("O segundo valor ,%.0f, eh o maior",(float)valor2);
			}
	}
}

