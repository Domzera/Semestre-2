import java.util.Scanner;

public class Lista07Exerc05 {
	
	public static void main (String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int i,contador1=0;
		String variavel="";
		
		System.out.println("Digite uma frase ");
		variavel=Sc.nextLine();
		
		System.out.println("A frase tem "+variavel.length()+" letras.");
		
		for(i=0;i<=variavel.length()-1;i++){//Aqui tem um -1 que é para o tamnhao da string ficar certo
			
			if(variavel.charAt(i)=='a' || variavel.charAt(i)=='A')
				contador1++;
			
			//(variavel.charAt(i)=='a' || variavel.charAt(i)=='A') ? contador1++ : contador2 ;
			
		}
		System.out.print("contador 1 = "+contador1);
		
	}
}

