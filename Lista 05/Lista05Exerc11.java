import java.util.Scanner;

public class Lista05Exerc11 {
	
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		Scanner scS= new Scanner(System.in);
		
		int valor1=0,valor2=0;
		String valor3="";
		
		System.out.println("Primeiro valor");
		valor1=sc.nextInt();
		System.out.println("Segundo valor");
		valor2=sc.nextInt();
		System.out.println("Qual a operacao + - / * ");
		valor3=scS.nextLine();
		
		switch(valor3){
		case"+":
			System.out.printf("A soma eh %.2f",(float)(valor1+valor2));
			break;
		case"-":
			System.out.printf("A subtracao eh %.2f",(float)(valor1-valor2));
			break;
		case"*":
			System.out.printf(" multiplicacao eh %.2f",(float)(valor1*valor2));
			break;
		case"/":
			System.out.printf("A divisao eh %.2f",(float)(valor1/valor2));
			break;
		default:
			System.out.println("Escola uma das opcoes validas");
		}
	}
}

