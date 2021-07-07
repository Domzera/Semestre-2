import java.util.Scanner;

public class Lista07Exerc06 {
	
	public static void main (String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int i,contador1=0;
		String variavel1="",variavel2="";
		
		System.out.println("Digite uma frase ");
		variavel1=Sc.nextLine();
		
		System.out.println("Digite uma letra M ou m:");
		variavel2=Sc.nextLine().toLowerCase();
		
		System.out.println("A frase tem "+variavel1.length()+" letras.");
		
		for(i=0;i<=variavel1.length()-1;i++){//Aqui tem um -1 que é para o tamnhao da string ficar certo
			
			if(variavel1.toLowerCase().charAt(i)== variavel2.toLowerCase().charAt(0))
				contador1++;
			
		}
		System.out.print("\ncontador 1 = "+contador1);
		
	}
}

