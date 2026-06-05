 	package day_5;

public class Combination_of_two_digit_numbers_backtracking {

 static void backtrack (char[]arr, int index) {
	 
	 if (index == arr.length) {
		 System.out.println(new String(arr));
		 return ;
	 }
	 
	 arr[index] = '2';
	 backtrack(arr, index +1);
	 
	 arr[index] = '1' ;
	 backtrack(arr, index + 1);
		
	}
 
 public static void main(String[] args) {
	 int n = 2;
	 backtrack(new char[n], 0 );
	 
 }
	
	
	
}
