import java.util.Scanner;

public class Lista06Exer59 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int termo1=0,termo2=0,elemento=0,a=0,i;
		
		System.out.println("Digite o primeiro termo");
		termo1=sc.nextInt();
		System.out.println("Digite o segundo termo");
		termo2=sc.nextInt();
		
		System.out.println("Quantos elementos voce quer?");
		elemento=sc.nextInt();
		
		
		for(i=1;i<=elemento;i++){
		
			System.out.print(termo1+" ");
			
			a=termo1;
			termo1=termo2;
			termo2=a+termo1;
		
		}
		
		
	}
}

