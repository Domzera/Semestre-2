import java.util.Random;

public class AprovadoReprovadoRandom {
	
	public static void main (String[] args) {
		
		int teste=0;
		
		Random rnd = new Random();
		
		teste=rnd.nextInt(11);
		
		if(teste>6)
		System.out.print("Aprovado - nota: "+teste);
		
		if(teste<=6)
		System.out.print("Reprovado - nota: "+teste);
		
		
	}
}

