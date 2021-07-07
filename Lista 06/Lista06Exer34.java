import java.util.Scanner;

public class Lista06Exer34 {

    public static void main(String[] arg){
		Scanner leia=new Scanner(System.in);
		
		int entrada1=0,numero=0,contador=0;
		
		do{		
			if(entrada1<=0){
				System.out.println("Digite um valor");
				entrada1=leia.nextInt();
			}
			
			if(entrada1==0)
				break;
			
			if(entrada1>0){
					
					System.out.print((numero*(numero+1)/2));
					
					if(numero<entrada1){
						System.out.print(",");
					}
					
					if(numero==entrada1){
						break;
					}
					numero++;
			}
			}while(entrada1<=-1 || numero<=entrada1);
    }
}
