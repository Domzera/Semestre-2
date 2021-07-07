import java.util.Scanner;

public class Lista06Exer14 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero1=0,numero2=0,i=0,a=0,b=0,soma=0;
		
		System.out.print("Digite um numero ");
		numero1=leia.nextInt();				
				
		System.out.print("Digite o segundo numero ");
		numero2=leia.nextInt();
			
			while(numero1<=numero2){
				soma=numero1+soma;
				numero1++;
				}
			
			System.out.println("O resultado eh: "+soma);
			
		}
}
