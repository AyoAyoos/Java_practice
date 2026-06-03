package day_3;

import java.util.Scanner;


// WAP to create a 3*3 array with userinput values and display each value

public class Wap_3x3_array {
	
	public static void main(String[]args) {
	
	int[][] arr= new int[3][3];
	
	Scanner scr=new Scanner(System.in);
	
	 for(int i = 0; i<arr.length;i++) {
		 for(int j = 0 ; j<arr[i].length;j++) {
			 System.out.print("enter value for i  " +i +"j "+j);
			 arr[i][j]= scr.nextInt();
		 }
	 }
	 
		 for(int i = 0; i<arr.length;i++) {
			 for(int j = 0 ; j<arr[i].length;j++) {
				 System.out.print(arr[i][j]+"\t");
			 }
			 System.out.println(" ");
		 }
		 
	 
	}
	
}