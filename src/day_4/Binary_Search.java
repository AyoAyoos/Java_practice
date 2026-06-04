package day_4;

public class Binary_Search {
	
	public static void main(String[]args) {
		
		int[]  arr= { 10,28,35,60,78};
		int target = 60;
		int left =0 ;
		int right =  arr.length -1;
		
		while(left<right) {
			int mid = (left + right)/2;
			
			
			if (arr[mid]==target) {
				System.out.println("value" + mid);
				break;
			}
			if(arr[mid]<target) {
				left = mid +1;
				
			}else {
				right=mid-1;
			}
		}
		
	}

}
