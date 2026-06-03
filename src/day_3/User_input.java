package day_3;

// input using args

import java.util.Scanner;

public class User_input {
	
	
	public static void main(String[]args) {
		
		
		//using scanner
		
		Scanner scr= new Scanner(System.in);

		System.out.println("Value ::" );

		int testValue=scr.nextInt();
		
		System.out.println("Value ::"+testValue );
		
		
		// using args
		
		int argsValue=Integer.parseInt(args[0]);
		System.out.println("argValue"+ argsValue);

		
		
// to see multiple args values
		
		System.out.println("argValue"+args[0]);
		System.out.println("argValue"+args[1]);System.out.println("argValue"+args[2]);System.out.println("argValue"+args[3]);
		
	}

}
