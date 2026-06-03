
//ABP maza wants to find max watcher count for consective 3 days from below array. with complexity 0(n)
//
//arr={25,45,74,80,90,40,60,80,40,50,40}



package day_3;

public class find_max_watcher {

	
	 public static void main(String[]args) {
		 
		 

		        int[] arr = {25,45,74,80,90,40,60,80,40,50,40};
		        
		        
		        int maxSum = arr[0]+arr[1]+arr[2];
		        
		        for (int i=3; i<arr.length ; i++) {
		        	int sum=arr[i]+arr[i-1]+arr[i-2];
		        	if(sum > maxSum)
		        		maxSum = sum;
		 
		        }

		        System.out.println(maxSum);
		    }
	 
	 }

