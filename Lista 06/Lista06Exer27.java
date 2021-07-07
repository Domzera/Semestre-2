public class Lista06Exer27 {
	
	public static void main (String[] args) {
		
		int i,y,b;
		
		for(i=0;i<=10;i++){
			b=10;
			System.out.printf("%d, ",i);
			
			for(y=10;y>=i;y--){
				
				System.out.printf("%d ",b--);
				
			}
			System.out.print("\n");
		}
		
	}
}

