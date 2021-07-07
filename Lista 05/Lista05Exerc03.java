import java.util.Scanner;

public class Lista05Exerc03 {
	
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int valor=0;
		
		System.out.println("Digite a quantidade de masa");
		valor=sc.nextInt();
		
		if(valor>12){
			System.out.printf("O valor da compra eh %.2f",valor*1.3);
		}else{System.out.print("O valor da compra eh "+valor);}
	}
}

