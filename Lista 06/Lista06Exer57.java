import java.util.Scanner;

public class Lista06Exer57 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int elementos=0,i=1,y=0,a=1,b=0;
		
		System.out.println("Quantos elementos voce quer?");
		elementos=sc.nextInt();
				
		while(i<=elementos){
		b=0;
			for(y=1;y<a;y++){
				if(a%y==0)b=b+y;
			}
			if(b==a){
				System.out.print(b+" ");			
				i++;
			}
		a++;
		}
	}
}
