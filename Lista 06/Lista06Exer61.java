import java.util.Scanner;

public class Lista06Exer61 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int termo=0,i=1,a=2,b=1,c=0,d=0;
		
		System.out.println("Quantos termos voce quer?");
		termo=sc.nextInt();
		
		while(i<=termo){
			
			System.out.print(a+"/"+b+" ");
		
			c=c+a;
			d=d+b;
			
			a=a+2;
			b=b+2;
			
		i++;
		}
		System.out.println("\na soma dos termos eh: "+c+"/"+d);
	}
}

