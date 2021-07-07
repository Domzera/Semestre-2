import java.util.Scanner;

public class Lista05Exerc09 {
	
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int valor1=0,valor2=0,valor3=0,valor4=0,valort=0;
		
		System.out.println("Horas trabalhadas na primeira semana");
		valor1=sc.nextInt();
		System.out.println("Horas trabalhadas na segunda semana");
		valor2=sc.nextInt();
		System.out.println("Horas trabalhadas na terceira semana");
		valor3=sc.nextInt();
		System.out.println("Horas trabalhadas na quarta semana");
		valor4=sc.nextInt();
		
		valort=valor1+valor2+valor3+valor4;
		
		if(valort<=160){
			System.out.printf("Trabalhou %.0f horas, vai receber um salario",(float)valort);
		}else{
			System.out.printf("Trabalhou %.0f horas e %.0f horas extras, vai receber %.0f horas trabalhadas",(float)160,(float)(valort-160),(float)((valort-160)*1.5)+160);
			}
	}
}

