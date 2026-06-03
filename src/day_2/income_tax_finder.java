package day_2;

public class income_tax_finder {
	
	public static void main(String[]args) {
		
	
		
		double amount = 450000;
		double tax = 0 ;
		
		if( amount <= 250000) {
	    System.out.println("no tax ");
	    tax = amount * 0 ;
		} else if (amount <= 500000 ){
			
			tax = amount*0.05 ;
			
			
		} else if (amount <= 1000000){
			
			tax = amount*0.20 ;
			
		}else if (amount <= 2000000){
			
			tax = amount*0.30;
			
			
			
			
		}
		
		
		
		System.out.println("ACCORDING TO OLD TAX REGIME");
		System.out.println("Income="+ amount);
		System.out.println("Tax = "+ tax);

		
		
		
		
		
		
		
		
	}

}
