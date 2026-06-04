package day_4;

import java.util.Scanner;

// WAP to find the index of user provided charaters from alphabets


public class BS_q1 {


public static void main(String[]args) {
	
	
	Scanner scr= new Scanner(System.in);

	
	
	char[] arr = {
		    'A','B','C','D','E','F','G','H','I','J',
		    'K','L','M','N','O','P','Q','R','S','T',
		    'U','V','W','X','Y','Z'
		};
	
	 System.out.print("Enter target value: ");
	 
	 
	 char target = scr.next().charAt(0);
     
     
	int left =0 ;
	int right =  arr.length -1;
	
	while(left<right) {
		int mid = (left + right)/2;
		
		
		if (arr[mid]==target) {
			System.out.println("value  " + mid);
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
