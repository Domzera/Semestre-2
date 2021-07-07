public class Lista06Exer29 {
	
	public static void main (String[] args) {
		
		int i,y,a,b;
		
		for(i=1;i<=10;i++){
			
			System.out.printf("%d, ",i);
			
			if(i%2!=0){
				
				for(y=1;y<=10;y=y+2){
				
					System.out.printf("%d ",y);
					
				}
				System.out.print("\n");
			}
		
			if(i%2==0){
				
				for(y=2;y<=10;y=y+2){
				
					System.out.printf("%d ",y);

				}
				System.out.print("\n");				
			}
		
		}
		
	}
}

