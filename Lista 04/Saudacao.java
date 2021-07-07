import java.time.LocalDateTime;

public class Saudacao {
	
	public static void main (String[] args) {
		LocalDateTime time = LocalDateTime.now();
		
		System.out.print("\n : "+time.getHour()+":"+time.getMinute()+":"+time.getSecond());
		
		if((time.getHour())>=0 && (time.getHour())<6)
			System.out.print("\nZzzzz");
			
		else if((time.getHour())>=6 && (time.getHour())<12)
			System.out.print("\nBom dia");
			
		else if((time.getHour())>=12 && (time.getHour())<18)
			System.out.print("\nBoa tarde");
		
		else
			System.out.print("\nBoa noite");
		
	}
}

