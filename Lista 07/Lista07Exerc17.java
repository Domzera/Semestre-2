import java.util.Scanner;

public class Lista07Exerc17 {
	
	public static void main (String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int contador=0,total=0,i;
		String variavel1="",variavel2="",frase="";
		
		System.out.println("Digite a frase 1 ");
		variavel1=Sc.nextLine().toLowerCase();   //   Transforma tudo em minuscula
		
		System.out.println("Digite a frase 2 ");
		variavel2=Sc.nextLine().toLowerCase();   //   Transforma tudo em minuscula
		
		//System.out.println("A frase tem "+variavel1.length()+" letras.");
		
		if(variavel1.length()==variavel2.length()){
		
			for(i=0;i<=variavel1.length()-1;i++){//Aqui tem um -1 que é para o tamnhao da string ficar certo
			
				if(variavel1.charAt(i)==variavel2.charAt(i)){
					contador++;
				}
			}
		}

		if(contador>0){
		System.out.println("As frases sao iguais");
		}else{System.out.println("As frases nao sao iguais");}
	}
}

