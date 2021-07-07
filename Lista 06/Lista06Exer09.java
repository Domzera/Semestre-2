import java.util.Scanner;

public class Lista06Exer09 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero=0,ent=0,i;
		
		for(i=1;i<=10;i++){
				System.out.print(i+" - Digite um numero: ");
				numero=leia.nextInt();				
				
				if(numero>=10 && numero<=20){
					ent++;
					}
		}
		
			if(ent>1){
				System.out.print("Foram digitados "+ent+" numeros entre 10 e 20 inclusos.");
				}if(ent==0){
					System.out.print("Nenhum numero entre 10 e 20 foi digitado.");
					}if(ent==1){System.out.print("Foi digitado "+ent+" numeros entre 10 e 20 inclusos.");}
leia.close();	
}
}
