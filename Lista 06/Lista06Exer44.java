import java.util.Scanner;

public class Lista06Exer44 {
	
	public static void main (String[] args) {
		Scanner leia=new Scanner(System.in);
		
		int cont1=0,cont2=0,fator=1,i,y;
		
		System.out.println("\nDigite um valor para fatorar");
		cont1=leia.nextInt();
		
		cont1=--cont1;
		
		for(i=0;i<=cont1;i++){
				System.out.print(fator);
				//System.out.println("i "+i);
				//System.out.println("cont2 "+cont2);
				cont2++;
				fator=fator*cont2;
				if(i!=cont1){
					System.out.print(", ");
				}		
		}
		
	}
}

