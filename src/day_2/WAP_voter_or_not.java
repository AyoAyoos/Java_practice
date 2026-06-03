package day_2;

public class WAP_voter_or_not {
	
	public static void main(String[]args) {
		
		System.out.println("Critaria of being a voter is above 18\n");
		
		
		int age = 17;
		
		String citizenship = "Indian";
		
		if(age>=18 && citizenship=="Indian") {
			
			System.out.println("you are a voter");
			
			
		} else {
			System.out.println("you are not the voter");
		}
		
	}

}
