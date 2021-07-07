import java.util.Scanner;

public class Lista06Exer36 {

    public static void main(String[] arg){
		Scanner leia=new Scanner(System.in);
		
		int entrada1=0,numero=0,contador=0;
		
		do{		
			if(entrada1<=0){
				System.out.println("digite um valor");
				entrada1=leia.nextInt();
			}
			
			if(entrada1==0)
				break;
			
			if(entrada1>0){
					
					if(numero==1){
						System.out.print(numero);
						System.out.print(", ");
					}
					
					if(numero>1){
						System.out.print("1/"+numero);
						
						if(numero!=entrada1)
							System.out.print(", ");
					}
					
					if(numero==entrada1){
						break;
					}
					numero++;
			}
			}while(entrada1<=-1 || numero<=entrada1);
    }
}
