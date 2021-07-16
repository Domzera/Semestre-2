import java.util.Scanner;

public class Lista06Exer56 {
	
	public static void main (String[] args) {
		
		int i,a=0,b=1;
				
		for(b=1;b<900;b++){
			a=0;
			for(i=1;i<b;i++){
				if(b%i==0){
					a=a+i;
					if(a==b)System.out.print(" "+b);
				}
			}
		}
	}
}
