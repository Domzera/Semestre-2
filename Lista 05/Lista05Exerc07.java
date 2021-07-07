import java.util.Scanner;

public class Lista05Exerc07 {
	
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int valor1=0,valor2;
		
		System.out.println("Digite um valor");
		valor1=sc.nextInt();
		System.out.println("Digite outro valor");
		valor2=sc.nextInt();
		
		if(valor1>valor2){
			System.out.printf("%.0f %.0f",(float)valor2,(float)valor1);
		}else{
			System.out.printf("%.0f %.0f",(float)valor1,(float)valor2);
			}
	}
}

