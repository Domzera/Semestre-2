import java.util.Scanner;

public class Lista07Exerc23 {
	
	public static void main (String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int contador=0,cont=0,i,y=0,a=0;
		String variavel="";
		
		System.out.println("Digite seu nome completo");
		variavel=Sc.nextLine();
		
		for(i=0;i<=variavel.length()-1;i++){
			if(variavel.charAt(i)==' ')cont++;
		}
		
		//System.out.println(cont);
		
		String[] str = variavel.split("[ ]");
		
		for(i=0;i<=cont;i++){
				
				if(i==cont)System.out.println(/*"Str=["+i+"]  "+*/"\nO ultimo nome he "+str[i]);
		}
	}
}

