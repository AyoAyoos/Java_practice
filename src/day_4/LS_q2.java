package day_4;



// WAP to find the first number whoes next  number greater than number and perivous us smaller then the number 

// arr = { 10,4,2,0,8,100,50}


public class LS_q2 {
	
	
	public static void main(String[]args) {
		
		int[] arr = { 10,4,2,0,8,100,50};
		
		
	
		 
		 
		 for(int i = 0; i<arr.length ; i++) {
			 
			 if(arr[i] < arr[i + 1] && arr[i] > arr[i -1]) {
				 System.out.println(" the number is" + arr[i]);
				 break;
			 }
			 System.out.println();
		 }
	}

}
