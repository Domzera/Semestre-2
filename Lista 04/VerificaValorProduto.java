import java.util.Random;
import java.util.Scanner;

public class VerificaValorProduto {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Random rnd = new Random();
		
		int produto1=0,produto2=0;
		
		//produto1=rnd.nextInt(1000);
		//produto2=rnd.nextInt(1000);
		
		System.out.println("Valor do produto 1: ");
		produto1=leia.nextInt();
		System.out.println("Valor do produto 2: ");
		produto2=leia.nextInt();
		
		if(produto1<produto2)
		System.out.print("\nO produto 1 eh mais barato: "+produto1);
		
		if(produto1>produto2)
		System.out.print("\nO produto 2 eh mais barato: "+produto2);
		
		if(produto1==produto2)
		System.out.print("\nOs produtos te preco igual");
		
		
	}
}

