import java.util.Scanner;

public class Lista06Exer17 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Scanner leiaStr = new Scanner(System.in);
		
		int nota1,nota2;
		double media;
		char resposta='n';
		
		do{
			do{
				System.out.print("Nota 1: ");
				nota1=leia.nextInt();	
				if(nota1<0||nota1>10){
					System.out.println("\n\tSomente valores entre 0 e 10");
					}
				}while(nota1<0||nota1>10);
				
				do{
				System.out.print("Nota 2: ");
				nota2=leia.nextInt();	
				if(nota2<0||nota2>10){
					System.out.println("\n\tSomente valores entre 0 e 10");
					}
				}while(nota2<0||nota2>10);
				
				media=(nota1+nota2)/2;				
				System.out.print("\nSua media eh: "+media);
				
				System.out.println("\nNovo calculo [S/N]:");
				resposta=leiaStr.nextLine().toLowerCase().charAt(0);
				
			}while(resposta=='s'||resposta=='S');
		
			System.out.print("Volte sempre!");
			leia.close();
			leiaStr.close();
			
		}
}
