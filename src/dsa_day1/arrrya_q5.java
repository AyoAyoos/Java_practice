

//find_number_if_zero


package dsa_day1;

public class arrrya_q5 {
	
	
	public static void main(String[]args) {
		
	  int[] arr= {100,10,11,23,45,70,60,70,101};
	  
	  int count=0;
	  
	  for(int i = 0; i < arr.length ; i++) {
		  
		 int num = arr[i];
		 
		 while( num > 0) {
			 if(num % 10 == 0) {
				 count++;
			 }
			 num= num/10;
		 }
				 
		  
	  }
	  System.out.println(count);
	  
	}

}
