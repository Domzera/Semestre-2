import java.util.Scanner;

public class Lista06Exer22 {

    public static void main(String[] arg){
		Scanner leia=new Scanner(System.in);
		
		int maior=0,menor=0,entrada=0,i=1,soma=0;
		char resposta='s';
		
		do{		
			System.out.println("Digite o numero "+i);
			entrada=leia.nextInt();
			
			soma=entrada+soma;
			
			if(maior<entrada)
				maior=entrada;
			
			i++;
				
			}while(i<=4);
		
		System.out.println("O maior eh "+maior);
		System.out.println("A media eh "+soma/(i-1));
        
    }
    
}
