import java.util.Scanner;

public class Lista06Exer45 {
	
	public static void main (String[] args) {
		Scanner leia=new Scanner(System.in);
		
		int cont1=0,cont2=0,fator=1,i,y;
		
		System.out.println("\nDigite um valor para fatorar");
		cont1=leia.nextInt();
		
		y=cont1;
		
		for(i=cont1;i>=0;i--){
			cont2=0;
			fator=1;
			
			for(y=0;y<=i;y++){
				
				//System.out.print(fator+", ");
				cont2++;
				fator=fator*cont2;
				
				if(y==i){//imprime todos os ultimos
					System.out.print(fator);
					if(fator!=1)
						System.out.print(", ");
				}
			}
		}
	}
}

