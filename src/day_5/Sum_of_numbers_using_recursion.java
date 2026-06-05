package day_5;

//sum of all even numbers using recursion



public class Sum_of_numbers_using_recursion {

	

		    public static void main(String[] args) {
	
		    	Sum_of_numbers_using_recursion obj = new Sum_of_numbers_using_recursion();
	
		        int result = obj.sumEven(50);
	
		        System.out.println("Sum = " + result);
		    }
	
		    public int sumEven(int n) {
	
		        if (n == 0) {
		            return 0;
		        }
	
		        return n + sumEven(n - 2);
		    }
		}