import java.util.Scanner;

public class Lista06Exer39 {

    public static void main(String[] arg){
		Scanner leia=new Scanner(System.in);
		
		int entrada1=0,numero=1,contador=0,soma1=0,soma2=0;
		
		do{		
			if(entrada1<=0){
				System.out.println("digite um valor");
				entrada1=leia.nextInt();
			}
			
			if(entrada1==0)
				break;
			
			if(entrada1>0){
				
				if(contador==0)contador=entrada1;
					
					if(numero<=entrada1){
						
						System.out.print(numero+"/"+contador);
						
						if(numero!=entrada1)
							System.out.print(", ");
							
						soma1=soma1+numero;
						soma2=soma2+contador;
						}
					
					if(numero==entrada1){
						break;
					}
				numero++;
				contador--;
			}
			}while(entrada1<=-1 || numero<=entrada1);
			
			System.out.println("\n\nA soma eh: "+soma1+"/"+soma2);
    }
}
