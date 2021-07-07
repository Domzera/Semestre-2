import java.util.Scanner;

public class Lista06Exer23 {

    public static void main(String[] arg){
		Scanner leia=new Scanner(System.in);
		
		int maior=0,filho=0,entrada=0,entrada1=0,i=1,salario=0;
		char resposta='s';
		double percentual=0;
		
		do{		
			
			entrada=0;
			entrada1=0;
			
			System.out.println("Qual eh o salario");
			entrada=leia.nextInt();
			
			if(entrada<=0)
				break;
			
			salario=entrada+salario;
			
			if(maior<entrada)
				maior=entrada;
			
			if(entrada>150)
				percentual++;
				
			System.out.println("Quantos filhos");
			entrada1=leia.nextInt();
			
			filho=entrada1+filho;
			
			i++;
				
			}while(salario>=0);
		
		System.out.println(i);
		System.out.println("A media de salario eh "+salario/--i);
		System.out.println("A media de filhos eh "+filho/i);
		System.out.println("A maior salario eh "+maior);
		System.out.printf("O percentual de pessoas com salarios acime de 150,00 eh %.2f %%",percentual/i);
        
    }
    
}
