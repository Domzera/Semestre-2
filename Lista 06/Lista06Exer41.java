import java.util.Scanner;

public class Lista06Exer41 {
	
	public static void main (String[] args) {
		Scanner leia=new Scanner(System.in);
		
		int cont1=0,cont2=0,fator=1,i;
		
		System.out.println("digite um valor para fatorar");
		cont1=leia.nextInt();
		
		for(i=0;i<=cont1;i++){
				System.out.print(fator);
				cont2++;
				fator=fator*cont2;
				if(i!=cont1){
					System.out.print(", ");
				}
				
		}
		
	}
}

