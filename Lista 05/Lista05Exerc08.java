import java.util.Scanner;

public class Lista05Exerc08 {
	
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int valor1=0,valor2;
		
		System.out.println("Digite o horario de comeco do jogo");
		valor1=sc.nextInt();
		System.out.println("Digite o horario de termino do jogo");
		valor2=sc.nextInt();
		
		
		
		if(valor1<valor2){
			System.out.printf("O jogo durou %.0f horas",(float)(valor2-valor1));
		}else{
			System.out.printf("O jogo durou e %.0f horas",(float)((24-valor1)+valor2));
			}
	}
}

