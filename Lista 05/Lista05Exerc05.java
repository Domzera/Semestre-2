import java.util.Scanner;

public class Lista05Exerc05 {
	
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int valor1=0,valor2;
		
		System.out.println("Em que ano estamos");
		valor1=sc.nextInt();
		System.out.println("Em que ano voce nasceu");
		valor2=sc.nextInt();
		
		if((valor1-valor2)>=18){
			System.out.printf("Sua idade he %.0f e voce pode votar",(float)(valor1-valor2));
		}else{
			System.out.printf("Sua idade eh %.0f e voce nau pode votar",(float)(valor1-valor2));
			}
	}
}

