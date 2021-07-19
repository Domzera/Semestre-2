import java.util.Scanner;

public class Lista06Exer58 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int elemento1=0,elemento2=0,a=0,i;
		
		System.out.println("Digite o primeiro termo");
		elemento1=sc.nextInt();
		System.out.println("Digite o segundo elemento");
		elemento2=sc.nextInt();
		
		for(i=0;i<=10;i++){
		
			System.out.print(elemento1+" ");
			
			a=elemento1;
			elemento1=elemento2;
			elemento2=a+elemento1;
		
		}
		
		
	}
}

