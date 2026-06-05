package day_5;

import java.util.Scanner;

public class simple_intrest_compund_intrest_using_methods {
	
	 public static void main(String[] args) {

	        Scanner scr = new Scanner(System.in);

	        System.out.print("Enter the Principal Amount: ");
	        double P = scr.nextDouble();

	        System.out.print("Enter the Rate of Interest: ");
	        double R = scr.nextDouble();

	        System.out.print("Enter the No. of Years: ");
	        double T = scr.nextDouble();

	        simple_intrest_compund_intrest_using_methods obj = new simple_intrest_compund_intrest_using_methods();

	        double si = obj.simpleInterest(P, R, T);
	        double ci = obj.compoundInterest(P, R, T);

	        System.out.println("Simple Interest = " + si);
	        System.out.println("Compound Interest = " + ci);

	        scr.close();
	    }

	    public double simpleInterest(double P, double R, double T) {
	        return (P * R * T) / 100;
	    }

	    public double compoundInterest(double P, double R, double T) {
	        double amount = P * Math.pow((1 + R / 100), T);
	        return amount - P;
	    }
	}