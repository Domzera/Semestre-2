public class Lista07Exerc02 {
	
	public static void main (String[] args) {
		int i;
		String variavel="";
		
		for(i=65;i<=90;i++){
			
				variavel=variavel+(char)i;
		}
		System.out.print("i= "+variavel);
		
		variavel="";
		
		for(i='A';i<='Z';i++){
			
				variavel=variavel+(char)i;
		}
		System.out.println("\nA= "+variavel);
	}
}

