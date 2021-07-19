import java.util.Scanner;

public class Lista06Exer60 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int termo1=0,termo2=0,elemento=0,a=0,b=0,i;
		
		System.out.println("Digite o primeiro termo");
		termo1=sc.nextInt();
		System.out.println("Digite o segundo termo");
		termo2=sc.nextInt();
		
		System.out.println("Qual elementos voce quer testar?");
		elemento=sc.nextInt();
		
		for(i=1;i<=elemento;i++){
		
			if(elemento==termo1){
				b=elemento;
				i=elemento;
			}
			
			if(elemento<=termo1){
				i=elemento;
			}
			
			System.out.print(termo1+" ");
			
			a=termo1;
			termo1=termo2;
			termo2=a+termo1;
		}
		if(b==elemento)System.out.print("\n\n"+elemento+" eh um elemento dessa sequencia.");
		else System.out.print("\n\n"+elemento+" nau eh um elemento dessa sequencia.");
	}
}

