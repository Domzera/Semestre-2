import java.util.Scanner;

public class Lista07Exerc07 {
	
	public static void main (String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int contador1=0;
		String variavel1="",variavel2="";
		
		System.out.println("Digite uma frase ");
		variavel1=Sc.nextLine().toLowerCase();//Transforma tudo em minuscula
		
		System.out.println("A frase tem "+variavel1.length()+" letras.");
		
		for(int i='a';i<='z';i++){
			contador1=0;
			
			for(int y=0;y<=variavel1.length()-1;y++){//Aqui tem um -1 que é para o tamnhao da string ficar certo
						
				if(variavel1.charAt(y)==i)
					contador1++;
			}
			System.out.println((char)i+" = "+contador1);
		}

		
		
	}
}

