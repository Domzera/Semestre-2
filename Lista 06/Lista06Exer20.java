import java.util.Scanner;

public class Lista06Exer20 {

    public static void main(String[] arg){
		Scanner leia=new Scanner(System.in);
		
		int maior=0,menor=0,entrada=0,i=1;
		char resposta='s';
		
		do{		
			System.out.println("Digite o numero "+i);
			entrada=leia.nextInt();
			
			if(maior<entrada)
				maior=entrada;
				
			if(menor==0)
				menor=entrada;
			
			if(menor>entrada)
				menor=entrada;
			
			i++;
				
			}while(i<=100);
		
		System.out.println("O maior eh "+maior);
		System.out.println("O menor eh "+menor);
        
    }
    
}
