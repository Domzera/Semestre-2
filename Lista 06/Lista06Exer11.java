import java.util.Scanner;

public class Lista06Exer11 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero=0,i,soma=0,alunos=0;
		
		System.out.print("Quantos alunos tem na sala? ");
		alunos=leia.nextInt();			
		
		for(i=1;i<=alunos;i++){
				System.out.print(i+" - Digite um numero ");
				numero=leia.nextInt();				
				
				soma=soma+numero;				
			}
			System.out.print("A media das notas da sala eh: " + soma/alunos);
		}
}
