import java.util.Scanner;

public class Lista07Exerc11 {
	
	public static void main (String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int contador1=0,contador2=0;
		String variavel1="",variavel2="";
		
		System.out.println("Digite uma frase ");
		variavel1=Sc.nextLine();//   .toLowerCase();   //   Transforma tudo em minuscula
		
		System.out.println("A frase tem "+variavel1.length()+" letras.");
		
		for(int y=0;y<=variavel1.length()-1;y++){//Aqui tem um -1 que é para o tamnhao da string ficar certo		
			if(variavel1.charAt(y)>='A' && variavel1.charAt(y)<='Z')
				contador1++;
					
			if(variavel1.charAt(y)>='a' && variavel1.charAt(y)<='z')
				contador1++;
				
			if(variavel1.charAt(y)>='0' && variavel1.charAt(y)<='9')
				contador2++;
		}

		System.out.println("Essa frase tem "+contador1+" letras.");
		System.out.println("Essa frase tem "+contador2+" numeros.");
		
	}
}

