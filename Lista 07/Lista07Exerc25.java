import java.util.Scanner;

public class Lista07Exerc25 {
	
	public static void main (String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int letras=0,numeros=0,simbolos=0,i=0,y=0,t=0,x=0;
		String variavel = "";
		String simbols = "@#$%&*()+";
		
		System.out.println("Digite uma senha ");
		variavel=Sc.nextLine().toLowerCase();   //   Transforma tudo em minuscula
		
		if(variavel.length()>=10){
			for(i=0;i<=variavel.length()-1;i++){
		
				for(y='a';y<='z';y++){
					if(variavel.charAt(i)==y)letras++;
				}
				
				for(t='0';t<='9';t++){
					if(variavel.charAt(i)==t)numeros++;
				}
				
				for(x=1;x<=7;x++){
					if(variavel.charAt(i)==simbols.charAt(x))simbolos++;
				}
			}
		}else{System.out.println("\nNau tem caracteres suficientes!\nDigite no minimo 10.");}
		//if(variavel.contains("@"))simbolos++;

		if(variavel.length()>=10){
			System.out.println("\nA palavra tem:");
			System.out.println("\nSimbolos "+simbolos);
			System.out.println("\nLetras "+letras);
			System.out.println("\nNumeros "+numeros);
		}
	}
}

