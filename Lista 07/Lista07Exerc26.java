import java.util.Random;

public class Lista07Exerc26 {
	
	public static void main (String[] args) {
		
		int teste=0,vogalcont=0,maiorSequencia=0;
		String alfabeto="abcdefghijklmnopqrstuvxwyz",vogal="aeiou",maisApareceSequencia="";
		Random gerador = new Random();
		
		for(int i=0;i<=100;i++){
			teste=(gerador.nextInt(25)+97);
				System.out.print((char)teste+" ");
				
				if(teste==100 || teste==110)System.out.print("  -Foi - ");
		}
		System.out.println("\n"+vogalcont);		
	}
}

