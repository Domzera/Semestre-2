public class Lista07Exerc03 {
	
	public static void main (String[] args) {
		int i;
		String variavel="";
		
		for(i=97;i<=122;i++){
			
				variavel=variavel+(char)i;
		}
		System.out.print("i= "+variavel);
		
		variavel="";
		
		for(i='a';i<='z';i++){
			
				variavel=variavel+(char)i;
		}
		System.out.println("\na= "+variavel);
	}
}

