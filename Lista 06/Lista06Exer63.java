import java.util.Scanner;

public class Lista06Exer63 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int termo=0,i=1,y=1,w=0,l=0,fib1=0,fib2=0,fib3=1,fib4=0,pri1=0,pri2=0,pri3=0;
		
		System.out.println("Quantos termos voce quer?");
		termo=sc.nextInt();
		
		while(i<=termo){
		y=1;
		w=1;
			fib1=fib2;
			fib2=fib3;
			fib3=fib1+fib2;
			

			while(y<=i){
			pri1=0;
				for(l=1;l<=w;l++){
						
						if(w%l==0)pri1++;
				//System.out.println("   pri1="+pri1+" w="+w);
				}
				if(pri1==2){
					y++;
					pri2=w;
				}
				w++;
			
			}
			//System.out.println(" pri1="+pri2);
			System.out.print(fib2+"/"+pri2+" ");
			fib4=fib2+fib4;
			pri3=pri3+pri2;
			i++;
		}
		System.out.println("\na soma dos termos eh: "+fib4+"/"+pri3);
	}
}

