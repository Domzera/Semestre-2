import java.util.Scanner;

public class Lista06Exer21 {

    public static void main(String[] arg){
		Scanner leia=new Scanner(System.in);
		Scanner leiaStr=new Scanner(System.in);
		
		int maior=0,menor=0,entrada=0,i=0,soma=0;
		char resposta='s';
		
		do{		
			System.out.println("Digite o numero "+i);
			entrada=leia.nextInt();
			
			soma=entrada+soma;
			
			if(maior<entrada)
				maior=entrada;
				
			if(menor==0)
				menor=entrada;
			
			if(menor>entrada)
				menor=entrada;
			
			i++;
			
			System.out.println("Mais numeros (S/N)");
			resposta=leiaStr.nextLine().toLowerCase().charAt(0);
				
			}while(resposta=='s'||resposta=='S');
		
		System.out.println("O maior eh "+maior);
		System.out.println("O menor eh "+menor);
		System.out.println("A quanti de numeros digitados foi de "+i);
		System.out.println("A media dos valores eh "+soma/i);
        
    }
    
}
