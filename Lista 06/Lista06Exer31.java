import java.util.Scanner;

public class Lista06Exer31 {

    public static void main(String[] arg){
		Scanner leia=new Scanner(System.in);
		
		int entrada1=0,numero=1,contador=0;
		
		do{		
			
			if(entrada1<=0){
			
				System.out.println("\ndigite um valor");
				entrada1=leia.nextInt();
					
			}
			
			if(entrada1==0)
				break;
			
			if(entrada1>0){
			
					System.out.print(numero);
					
					if(numero!=entrada1){
						
						System.out.print(",");
					
					}
					
					if(numero==entrada1){
						
						break;
					
					}
					
					numero++;
					
			}
				
			}while(entrada1<=-1 || numero!=1);
		
    }
    
}
