public class Lista07Exerc24 {
	
	public static void main (String[] args) {
		
		int numero=40,contador=0,contador1=0,contador0=0,contador01=0;
		String texto="";
		
		for(int i=0;i<=numero;i++){
			texto=texto+(int)(Math.random()*2);	
		}
		
		System.out.println("Numero aleatorio = "+texto);
		
		for( int i=0;i<texto.length();i++){
		
			if(texto.charAt(i)=='1'){
				contador++;
				
				if(contador==2){
					contador1++;
				}
				
			}else{
				contador=0;
			}
			
			if(texto.charAt(i)=='0'){
				contador0++;
				
				if(contador0==2){
					contador01++;
				}
				
			}else{
				contador0=0;
			}
		}
		System.out.println("UNS's = "+contador1);
		System.out.println("ZEROS's = "+contador01);
		System.out.println("TOTAL das somas = "+(contador01+contador1));
	}
}

