import java.util.Scanner;

public class Lista06Exer54 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inicio=0,fim=0,controle=1,a=0,b=0,c=1,d=0;
		
		System.out.println("Digite em qual termo comecar.");
		inicio=sc.nextInt();
		System.out.println("Digite em qual termo finalizar.");
		fim=sc.nextInt();
		
		while(fim>=controle){
			
			if(b>=(inicio-1))System.out.print(b+" ");
			a=b;
			b=a+c;
			c=a;
			
			controle++;
		
		}
	}
}
