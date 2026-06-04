
package day_4;

public class Linear_search2 {
	
	public static void main(String[]args) {
		
		
		 int[] arr= {5,8,1,10};
		 
		 int target =10;
		 
		 boolean targetNotExist = true;
		 
		 
		 
		 for(int i = 0; i<arr.length ; i++) {
			 
			 if(arr[i] == target) {
				 System.out.println("found index" + (i ) );
				 targetNotExist = false;

			     break;
		 }
		 
		
		 }
		 if (targetNotExist) {
			 System.out.println("not found");
	
	
	}

	}
}
