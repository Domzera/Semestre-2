import java.util.Scanner;

public class Lista07Exerc19 {
	
	public static void main (String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int contador=0,total=0,i,y;
		String variavel1="";
		
		System.out.println("Digite uma frase ");
		variavel1=Sc.nextLine();//.toLowerCase();   //   Transforma tudo em minuscula
		
		y=variavel1.length()-1;
		
		System.out.println("\nA frase tem "+variavel1.length()+" letras.");
		System.out.println("\nA ultima letra eh "+variavel1.charAt(y)+".");
		System.out.println("\nA a primeira eh letra eh "+variavel1.charAt(0)+".");
		
		for(i=0;i<=variavel1.length()-1;i++){
		
			if(variavel1.charAt(i)==variavel1.charAt(y)){
				total=total+1;
			}
			//System.out.println(variavel1.charAt(i)+"  "+variavel1.charAt(y));
			y--;
		}

		if(total==variavel1.length()){
		System.out.println("\nA palavra eh um palindromo");
		}else{System.out.println("\nA frase nao eh um palindromo");}
	}
}

