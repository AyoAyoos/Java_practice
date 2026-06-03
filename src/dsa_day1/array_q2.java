
// wap sum of element form the below arr =[20,-40,50,80,0,60,1,2,5]


package dsa_day1;

public class array_q2 {
	public static void main(String[]args) {
		
		int[] arr=  {20,-40,50,80,0,60,1,2,5};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
		
		 sum = sum + arr[i];
		}
		 
		 System.out.println("Total_sum =" + sum);
		 
		}
		
	}


