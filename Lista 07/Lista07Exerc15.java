import java.util.Scanner;

public class Lista07Exerc15 {
	
	public static void main (String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int contador=0,total=0,i;
		String variavel1="",variavel2="",frase="";
		
		System.out.println("Digite uma frase ");
		variavel1=Sc.nextLine().toLowerCase();   //   Transforma tudo em minuscula
		
		System.out.println("A frase tem "+variavel1.length()+" letras.");
		
		for(i=0;i<=variavel1.length()-1;i++){//Aqui tem um -1 que é para o tamnhao da string ficar certo		
			
			for(int y='0';y<='9';y++){
			
				if(variavel1.charAt(i)==y){
					contador++;
				}
			}
		}

		System.out.println("Essa frase tem "+contador+" numeros");
	}
}

