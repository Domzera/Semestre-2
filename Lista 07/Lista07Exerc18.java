import java.util.Scanner;

public class Lista07Exerc18 {
	
	public static void main (String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int contador=0,total=0,i;
		String variavel1="";
		
		System.out.println("Digite uma frase ");
		variavel1=Sc.nextLine().toLowerCase();   //   Transforma tudo em minuscula
		
		
		System.out.println("\nA frase tem "+variavel1.length()+" letras.");
		
		for(i=0;i<=variavel1.length()-1;i++){
		
			if(variavel1.charAt(i)=='0' || variavel1.charAt(i)=='1'){
				total=total+1;
			}
		
		}

		if(total==variavel1.length()){
		System.out.println("\nA frase eh binaria");
		}else{System.out.println("\nA frase nao eh binaria");}
	}
}

