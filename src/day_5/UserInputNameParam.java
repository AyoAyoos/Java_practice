package day_5;

import java.util.Scanner;

public class UserInputNameParam {

	
	
	public static void main(String[]args) {
		
		Scanner scr = new Scanner(System.in);
		System.out.println("enter the name");
		String name = scr.next();
		
		
		UserInputNameParam obj = new  UserInputNameParam();
		obj.namePrint(name);
		

		
	}
	public void namePrint(String testName) {
		System.out.println(testName);
		
	}
	
	

}
