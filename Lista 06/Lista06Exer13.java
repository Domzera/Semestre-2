import java.util.Scanner;

public class Lista06Exer13 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero=0,i=0,soma=0;	
		
		for(i=1;i<=10;i++){
				System.out.print(i+" - Digite um numero ");
				numero=leia.nextInt();				
				
				if(numero<40){
					soma=soma+numero;
					}
				
			}
			System.out.print("A soma dos numeros eh: " + soma);
		}
}
