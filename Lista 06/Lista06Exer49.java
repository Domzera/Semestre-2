import java.util.Scanner;

public class Lista06Exer49 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int entrada=0,contador1=1,contador2=1,elemento=1,i=1;
		
		System.out.println("Quantos elementos voce quer.");
		entrada=sc.nextInt();
		
		while(entrada>=contador1){
			elemento=0;
		
			for(i=1;i<=contador2;i++){
				if(contador2%i==0)elemento++;		
			}
			
			if(elemento==2){
				System.out.print(contador2+" ");
				contador1++;
			}
			
			contador2++;
		}
	}
}

