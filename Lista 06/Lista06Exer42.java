public class Lista06Exer42 {
	
	public static void main (String[] args) {
		
		int cont1=0,cont2=0,fator=1,i;
		
		for(i=0;i<=10;i++){
				System.out.print(fator);
				cont2++;
				fator=fator*cont2;
				if(i!=10){
					System.out.print(", ");
				}
		}
	}
}

