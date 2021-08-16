import java.util.Scanner;

public class Lista07Exerc22 {
	
	public static void main (String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int contador=0,total=0,i,y=0,a=0;
		String variavel1="",variavel2="";
		
		System.out.println("Digite uma frase ");
		variavel1=Sc.nextLine();//.toLowerCase();   //   Transforma tudo em minuscula
		System.out.println("Digite uma palavra");
		variavel2=Sc.nextLine();
		
		//System.out.println("\nA frase tem "+variavel1.length()+" letras.");
		
		for(i=0;i<=variavel1.length()-1;i++){
		
			System.out.print("   "+variavel1.substring(i));
			
			if(variavel1.substring(i).startsWith(variavel2)){
				System.out.print("<-- comeca com \""+variavel2+"\"");
				contador++;
			}
			System.out.println();
		}
		
		System.out.println("Ocorrencias: "+contador);
	}
}

