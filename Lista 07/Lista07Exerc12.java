import java.util.Scanner;

public class Lista07Exerc12 {
	
	public static void main (String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int A=0,a=0,E=0,e=0,I=0,i=0,O=0,o=0,U=0,u=0;
		String variavel="";
		
		System.out.println("Digite uma frase ");
		variavel=Sc.nextLine();//  .toLowerCase();   //   Transforma tudo em minuscula
		
		System.out.println("A frase tem "+variavel.length()+" letras.");
		
		for(int y=0;y<=variavel.length()-1;y++){//Aqui tem um -1 que é para o tamnhao da string ficar certo		
			
			if(variavel.charAt(y)=='A')
			A++;
				
			if(variavel.charAt(y)=='E')
			E++;
			
			if(variavel.charAt(y)=='I')
			I++;
			
			if(variavel.charAt(y)=='O')
			O++;
			
			if(variavel.charAt(y)=='U')
			U++;
			
			if(variavel.charAt(y)=='a')
			a++;
				
			if(variavel.charAt(y)=='e')
			e++;
			
			if(variavel.charAt(y)=='i')
			i++;
			
			if(variavel.charAt(y)=='o')
			o++;
			
			if(variavel.charAt(y)=='u')
			u++;
		}

		System.out.println("Essa frase tem "+A+" letras A.");
		System.out.println("Essa frase tem "+E+" letras E.");
		System.out.println("Essa frase tem "+I+" letras I.");
		System.out.println("Essa frase tem "+O+" letras O.");
		System.out.println("Essa frase tem "+U+" letras U.");
		System.out.println("Essa frase tem "+a+" letras a.");
		System.out.println("Essa frase tem "+e+" letras e.");
		System.out.println("Essa frase tem "+i+" letras i.");
		System.out.println("Essa frase tem "+o+" letras o.");
		System.out.println("Essa frase tem "+u+" letras u.");
		
	}
}

