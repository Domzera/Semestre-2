import java.util.Scanner;

public class Lista06Exer08 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero=0,neg=0,i;
		
		for(i=0;i<=10;i++){
				System.out.print("Digite um numero: ");
				numero=leia.nextInt();				
				
				if(numero<0){
					neg++;
					}
		}
		
			if(neg>1){
				System.out.print("Foram digitados "+neg+" numeros negativos");
			}else{System.out.print("Foi digitado "+neg+" numero negativo");}
			
			leia.close();
	}
		

}
