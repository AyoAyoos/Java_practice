package day_3;

////in class i want to fill reponses of students 
//// students     responses
//stud1      => yes,Good,Bad
//stud2     => No,Excellent,Excellent,Bad
//stud3=>yes,Bad
//stud4=>yes
//stud5=>yes, Good

// jagged array




public class input_questions_matrix {
	
		
		 public static void main(String[] args) {

		        String[][] responses = {
		            {"Yes", "Good", "Bad"},                     // Student 1
		            {"No", "Excellent", "Excellent", "Bad"},   // Student 2
		            {"Yes", "Bad"},                            // Student 3
		            {"Yes"},                                   // Student 4
		            {"Yes", "Good"}                            // Student 5
		        };

		        for (int i = 0; i < responses.length; i++) {

		            System.out.print("Student " + (i + 1) + " => ");

		            for (int j = 0; j < responses[i].length; j++) {
		                System.out.print(responses[i][j] + " ");
		            }

		            System.out.println();
		        }
		    }
		}