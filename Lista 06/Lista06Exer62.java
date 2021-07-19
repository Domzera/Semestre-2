import java.util.Scanner;

public class Lista06Exer62 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int termo=0,i=1,a=2,b=1,c=0,d=0,flag=0;
		
		System.out.println("Quantos termos voce quer?");
		termo=sc.nextInt();
		
		while(i<=termo){
			
			if(flag==0)System.out.print("+"+a+"/"+b+" ");
			else System.out.print("-"+a+"/"+b+" ");
		
			if(flag==1){
				c=c-a;
				d=d-b;
				flag=0;
			}else{
				c=c+a;
				d=d+b;
				flag=1;
			}
			
			a=a+2;
			b=b+2;
			
		i++;
		}
		System.out.println("\na soma dos termos eh: "+c+"/"+d);
	}
}

