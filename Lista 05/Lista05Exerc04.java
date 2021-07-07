import java.util.Scanner;

public class Lista05Exerc04 {
	
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int valor1=0,valor2;
		
		System.out.println("Digite a primeira nota");
		valor1=sc.nextInt();
		System.out.println("Digite a segunda nota");
		valor2=sc.nextInt();
		
		if(((valor1+valor2)/2)>=6){
			System.out.printf("Aprovado, a media eh %.2f",(float)(valor1+valor2)/2);
		}else{
			System.out.printf("Reprovado, a media eh %.2f",(float)(valor1+valor2)/2);
			}
	}
}

