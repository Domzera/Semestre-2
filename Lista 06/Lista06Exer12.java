import java.util.Scanner;

public class Lista06Exer12 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero=0,i,soma=0;	
		
		for(i=1;i<=10;i++){
				System.out.print(i+" - Digite um numero ");
				numero=leia.nextInt();				
				
				soma=soma+numero;				
			}
			System.out.print("A soma dos numeros eh: " + soma);
		}
}
