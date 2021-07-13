public class Lista06Exer47 {
	
	public static void main (String[] args) {
		
		int cont=0;
		
		for(int i=1;i<=100;i++){
			cont=0;
			
			for(int y=i;y>=1;y--){
				
				if(i%y==0){
				cont++;
				}
			}
			if(cont==2)System.out.print(" "+i+" ");
		}
	}
}

