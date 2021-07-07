import java.util.Scanner;

public class Lista06Exer19 {

    public static void main(String[] arg){
		Scanner leia=new Scanner(System.in);
		Scanner leiaStr=new Scanner(System.in);
		
		int quant,soma=0,cada,i=1,entrada=0;
		double media;
		char resposta='s';
        
        do{
			System.out.println("Digite o valor do produto "+i);
			entrada=leia.nextInt();
			soma=soma+entrada;
			System.out.println("Mais mercadorias (S/N)");
			resposta=leiaStr.nextLine().toLowerCase().charAt(0);
			i++;
			}while(resposta=='s'||resposta=='S');
		
		System.out.println("O valor do estoque eh "+(soma));
		//System.out.println("O valor do i eh "+(i-1));
		System.out.println("A media do valor do estoque eh "+(soma/(i-1)));
    }
    
}
