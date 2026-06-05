package day_5;

import java.util.Scanner;

public class print_multiple_times_no_loops_recursion {
	
public static void main(String[]args) {
		
		Scanner scr = new Scanner(System.in);
		System.out.println("enter the name");
		String name = scr.next();
		
		
	       System.out.print("How many times to print? ");
	        int count = scr.nextInt();
		
		
		
		print_multiple_times_no_loops_recursion obj = new print_multiple_times_no_loops_recursion();
		obj.printName(name, count);
		
}
public void printName(String name, int count) {
	if(count ==0)
		return;
	System.out.println(name);
	printName(name,count -1);
}

}



