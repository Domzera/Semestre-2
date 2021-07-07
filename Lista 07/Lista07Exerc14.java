import java.util.Scanner;

public class Lista07Exerc14 {
	
	public static void main (String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int contador=0,total=0,y;
		String variavel1="",variavel2="",frase="";
		
		System.out.println("Digite uma frase ");
		variavel1=Sc.nextLine().toLowerCase();   //   Transforma tudo em minuscula
		
		System.out.println("Digite uma letra ");
		variavel2=Sc.nextLine().toLowerCase();
		
		System.out.println("A frase tem "+variavel1.length()+" letras.");
		System.out.println(variavel2.charAt(0));
		
		for(y=0;y<=variavel1.length()-1;y++){//Aqui tem um -1 que é para o tamnhao da string ficar certo		
			
			if(variavel1.charAt(y)==variavel2.charAt(0)){
				frase = frase + "*";
			}else{
				frase = frase + variavel1.charAt(y);
			}
		}

		System.out.println(frase);
		
	}
}

