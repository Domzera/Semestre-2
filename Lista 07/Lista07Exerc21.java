import java.util.Scanner;

public class Lista07Exerc21 {
	
	public static void main (String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int contador=0,total=0,i,y=0;
		String variavel1="";
		
		System.out.println("Digite uma frase ");
		variavel1=Sc.nextLine();//.toLowerCase();   //   Transforma tudo em minuscula
		
		//System.out.println("\nA frase tem "+variavel1.length()+" letras.");
		
		for(i=0;i<=variavel1.length()-1;i++){
		
			if(variavel1.charAt(i)!=(char)' ')System.out.print(variavel1.charAt(i));
			else System.out.println("");
		}

		//System.out.println("\nA palavra tem "+y+" letras.");
	}
}

