package day_2;

public class if_else_student_grade {
	
	public static void main(String[]args) {
		
		
		
		 int marks = 96;
		 
		if(marks>=90) {
			System.out.println("you have Excellent Grade");
		} else if(marks >= 80 && marks <= 89) {
			System.out.println("you have A grade");
			
		}else if(marks >= 70 && marks <= 79) {
			System.out.println("you have B grade");
			
		} else if(marks >= 60 && marks <= 69) {
			System.out.println("you have c");
			
		}else if(marks >= 50 && marks <= 59) {
			System.out.println("you have D");
		}
		else if(marks >= 49) {
			System.out.println("you have F");
		}
		
		
		
	}

}
