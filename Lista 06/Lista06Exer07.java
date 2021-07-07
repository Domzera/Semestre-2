import java.util.Scanner;

public class Lista06Exer07 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero=0;
		
		while(numero<1 || numero>10){
				System.out.print("Digite um numero: ");
				numero=leia.nextInt();				
		}
		System.out.println("\nA tabuada de "+numero+" eh:\n");
		
		for(int i=0;i<=10;i++){
			System.out.println(i+" X "+numero+" = "+i*numero);
			}
		leia.close();
	}
}
