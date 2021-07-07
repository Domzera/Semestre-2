import java.util.Scanner;

public class Lista05Exerc12 {
	
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int valor1=0,valor2=0;
		String valor3="";
		
		System.out.println("Preco do produto");
		valor1=sc.nextInt();
		System.out.println("Codigo do produto");
		valor2=sc.nextInt();
		
		switch(valor2){
		case 1:
			System.out.printf("O preco eh %.2f , ele eh do Norte , o valor do frete eh %.2f , o valor total eh de %.2f .",(float)(valor1),(float)(valor1*.1),(float)(valor1*1.1));
			break;
			
		case 2 :
			System.out.printf("O preco eh %.2f , ele eh do Sul , o valor do frete eh %.2f , o valor total eh de %.2f .",(float)(valor1),(float)(valor1*.03),(float)(valor1*1.03));
			break;
		case 5 :
			System.out.printf("O preco eh %.2f , ele eh do Sul , o valor do frete eh %.2f , o valor total eh de %.2f .",(float)(valor1),(float)(valor1*.03),(float)(valor1*1.03));
			break;
		case 9 :
			System.out.printf("O preco eh %.2f , ele eh do Sul , o valor do frete eh %.2f , o valor total eh de %.2f .",(float)(valor1),(float)(valor1*.03),(float)(valor1*1.03));
			break;
			
		case 3 :
			System.out.printf("O preco eh %.2f , ele eh do Leste , o valor do frete eh %.2f , o valor total eh de %.2f .",(float)(valor1),(float)(valor1*.012),(float)(valor1*1.012));
			break;
		case 10 :
			System.out.printf("O preco eh %.2f , ele eh do Leste , o valor do frete eh %.2f , o valor total eh de %.2f .",(float)(valor1),(float)(valor1*.012),(float)(valor1*1.012));
			break;
		case 15 :
			System.out.printf("O preco eh %.2f , ele eh do Leste , o valor do frete eh %.2f , o valor total eh de %.2f .",(float)(valor1),(float)(valor1*.012),(float)(valor1*1.012));
			break;
			
		case 7 :
			System.out.printf("O preco eh %.2f , ele eh do Oeste , o valor do frete eh %.2f , o valor total eh de %.2f .",(float)(valor1),(float)(valor1*.073),(float)(valor1*1.073));
			break;
		case 20:
			System.out.printf("O preco eh %.2f , ele eh do Oeste , o valor do frete eh %.2f , o valor total eh de %.2f .",(float)(valor1),(float)(valor1*.073),(float)(valor1*1.073));
			break;
			
		default:
			System.out.printf("O preco eh %.2f , ele eh Importado , o valor do frete eh %.2f , o valor total eh de %.2f .",(float)(valor1),(float)(valor1*.222),(float)(valor1*1.222));
		}
	}
}

