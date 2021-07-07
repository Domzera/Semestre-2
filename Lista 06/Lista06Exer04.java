import java.util.Scanner;

public class Lista06Exer04 {
	
	public static void main (String[] args) {
		
		int numero,i=0;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		numero=leia.nextInt();
				
		
		//saida: 1 2 3 4 5 6 7 8 9 10
		
		while(i<=numero){
			System.out.print(i+" ");
			i++;
		}
		leia.close();
	}
}
