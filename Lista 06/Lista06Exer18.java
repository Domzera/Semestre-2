import java.util.Scanner;

public class Lista06Exer18 {

    public static void main(String[] arg){
		Scanner leia=new Scanner(System.in);
		
		int quant,soma=0,cada,i=1,entrada=0;
		double media;
                
        System.out.println("Quantos produtos tem na loja?");
        quant=leia.nextInt();
        
        //System.out.println(quant);
        
        while(i<=quant){
			System.out.println("Digite o valor do produto "+i);
			entrada=leia.nextInt();
			soma=soma+entrada;
			//System.out.println(soma);
			i++;
			}
		
		System.out.println("O valor do estoque eh "+(soma));
		System.out.println("A média do valor do estoque eh "+(soma/quant));
    }
    
}
