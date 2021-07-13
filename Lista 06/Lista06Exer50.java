import java.util.Scanner;

public class Lista06Exer50 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int entrada=0,contador1,contador2=1,controle=0,elemento,i,y;
		
		System.out.println("Quantos elementos voce quer.");
		entrada=sc.nextInt();
		
		for(i=entrada;i>=0;i--){
			contador1=1;
			contador2=1;
			controle=1;
			
		
			while(i>=contador1){
			elemento=0;
			
			
				for(y=contador2;y>=1;y--){
					if(contador2%y==0)elemento++;
				}
				
				if(elemento==2){
					contador1++;
					controle=contador2;
				}			
				contador2++;
			}
			System.out.print(controle+" ");
		}
	}
}

