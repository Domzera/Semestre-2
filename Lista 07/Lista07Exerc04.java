public class Lista07Exerc04 {
	
	public static void main (String[] args) {
		int i;
		String variavel="";
		
		for(i=48;i<58;i++){
			
				variavel=variavel+(char)i;
		}
		System.out.print("i= "+variavel);
		
		variavel="";
		
		for(i='0';i<='9';i++){
			
				variavel=variavel+(char)i;
		}
		System.out.println("\na= "+variavel);
	}
}

