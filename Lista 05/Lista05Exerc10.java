import java.util.Scanner;

public class Lista05Exerc10 {
	
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int valor1=0,valor2=0;
		
		System.out.println("Qual eh o salario");
		valor1=sc.nextInt();
		System.out.println("Total das vendas");
		valor2=sc.nextInt();
		
		if(valor2<=1500){
			System.out.printf("Seu salario eh de %.0f - As vendas totais foram de %.2f - Entao vai receber %.2f",(float)valor1,(float)valor2,(float)((valor2*0.3)+valor1));
		}else{
			System.out.printf("Seu salario eh de %.0f - As vendas totais foram de %.2f - Entao vai receber %.2f",(float)valor1,(float)valor2,(float)((valor2*0.5)+valor1));
			}
	}
}

