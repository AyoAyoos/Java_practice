package day_5;

import java.util.Scanner;

public class ReturnMethodDemo {
	
	
	public static void main(String[]aregs ) {
		
		
		Scanner scr = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scr.nextInt();
		
		ReturnMethodDemo obj = new ReturnMethodDemo();
		int newVar = obj.Incrementby2(num);
		System.out.println(newVar);
		
	}
	public int Incrementby2(int num) {
		return num + 2 ;
	}
	

}
