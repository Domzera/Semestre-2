import java.util.Scanner;

public class Lista06Exer48 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int entrada=0,contador=0,elementos=0,i=1,y=1,w=0;
		
		System.out.println("Quantos elementos voce quer.");
		entrada=sc.nextInt();
		
		while(w<entrada){
			contador=0;
		
			for(y=1;y<=i;y++){
				if(i%y==0)contador++;
			}
			
			if(contador==2){
				System.out.print(" "+i);
				w++;
			}
			i++;
		
		}
	
	}
}

