import java.util.Scanner;

public class Lista06Exer40 {

    public static void main(String[] arg){
		Scanner leia=new Scanner(System.in);
		
		int entrada1=0,numero=1,contador=0,contador2=1;
		
		do{		
			if(entrada1<=0){
				System.out.println("digite um valor");
				entrada1=leia.nextInt();
			}
			contador=2*entrada1;
			
			if(entrada1==0)
				break;
			
			if(entrada1>0){
				
				if(numero<=entrada1 && contador2<=entrada1){
					System.out.print(numero++);
					System.out.print(", ");
				}
				
				if(numero==entrada1){
					System.out.print(numero);
					System.out.print(", ");
					contador2++;
				}
				
				if(contador2>entrada1){
					System.out.print(--numero);
					if(contador2!=(entrada1*2))
						System.out.print(", ");
				}
				contador2++;
			}
			}while(entrada1<=-1 || contador2<=(entrada1*2));
    }
}
