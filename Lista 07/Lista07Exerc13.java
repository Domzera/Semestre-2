import java.util.Scanner;

public class Lista07Exerc13 {
	
	public static void main (String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int contador=0,total=0;
		String variavel1="",variavel2="";
		
		System.out.println("Digite uma frase ");
		variavel1=Sc.nextLine().toLowerCase();   //   Transforma tudo em minuscula

		
		System.out.println("A frase tem "+variavel1.length()+" letras.");
		
		for(int y=0;y<=variavel1.length()-1;y++){//Aqui tem um -1 que é para o tamnhao da string ficar certo		
			
			if(variavel1.charAt(y)=='a'  || variavel1.charAt(y)=='e'  || variavel1.charAt(y)=='i'  || variavel1.charAt(y)=='o'  || variavel1.charAt(y)=='u'  || variavel1.charAt(y)==' ')
				contador++;
		}
		
		total=variavel1.length()-contador;

		System.out.println("Tem "+total+" consoantes");
		
	}
}

