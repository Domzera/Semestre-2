import java.util.Scanner;

public class Lista06Exer65 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int termo=0,i=1,y=1,a=0,w=0,l=0,fat1=0,fat2=0,fat3=1,pri1=0,pri2=0,pri3=0;
		
		System.out.println("Quantos termos voce quer?");
		termo=sc.nextInt();
		
		while(i<=termo){
		y=1;
		w=1;
		fat1=1;
		
			for(l=1;l<=i;l++){
				fat1=fat1*l;
			}

			while(y<=i){
			pri1=0;
				for(l=1;l<=w;l++){
						if(w%l==0)pri1++;
				}
				if(pri1==2){
					y++;
					pri2=w;
				}
				w++;
			}
			
			System.out.print(fat1+"/"+pri2+"    ");
			
			fat2=fat2+fat1;
			pri3=pri3+pri2;
			
			i++;
		}
		
		System.out.println("\na soma dos termos eh: "+fat2+"/"+pri3);
	}
}

