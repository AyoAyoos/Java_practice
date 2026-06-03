
// WAP for find odd numbers in arr 
// arr={50,40,1,2,3,7,4,5,53,61,80}

package dsa_day1;

public class array_q3 {
	
	public static void main(String[]args) {
		
		int[] arr = {50,40,1,2,3,7,4,5,53,61,80};
		int count = 0;
		
		for(int i = 0; i < arr.length ; i++) {
			
			if(arr[i] % 2 != 0) {
				count++;
				
			
			}
			
		}

	
		
		System.out.println("Total_number =" + count);
		
	}

}
