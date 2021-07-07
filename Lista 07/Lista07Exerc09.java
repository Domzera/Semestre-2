import java.util.Scanner;

public class Lista07Exerc09 {
	
	public static void main (String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int contador1=0,conatdor2=0;
		String variavel1="",variavel2="";
		
		System.out.println("Digite uma frase ");
		variavel1=Sc.nextLine().toLowerCase();//Transforma tudo em minuscula
		
		System.out.println("A frase tem "+variavel1.length()+" letras.");
		
		for(int y=0;y<=variavel1.length()-1;y++){//Aqui tem um -1 que é para o tamnhao da string ficar certo		
			if(variavel1.charAt(y)==32)
					contador1++;
		}

		System.out.print("Essa frase tem "+contador1+" espacos.");
		
	}
}

