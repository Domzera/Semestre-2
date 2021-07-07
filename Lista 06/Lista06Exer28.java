public class Lista06Exer28 {
	
	public static void main (String[] args) {
		
		int i,y,a,b;
		
		for(i=1;i<=10;i++){
			
			System.out.printf("%d, ",i);
			
			a=i;
			
			for(y=a;y<=10;y++){
				
				System.out.printf("%d ",++a);
				
				a++;

			}
			System.out.print("\n");
		}
		
	}
}

