import java.util.Scanner;

public class Lista06Exer55 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero=0,controle=1,i,a=0;
		
		System.out.println("Digite um numero.");
		numero=sc.nextInt();
				
		for(i=1;i<numero;i++){
			if(numero%i==0)a=a+i;
		}
		
		if(a==numero)System.out.print(a+" Este eh um numero perfeito.");
		else System.out.print(numero+" Nau eh um numero perfeito");
	}
}
