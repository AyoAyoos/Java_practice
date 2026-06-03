package dsa_day1;

public class array_q6 {

	
	public static void main(String[]args) {
		
		int[] arr= {197,282,356,487,111,131,196};
		
		int count=0 ;
		
		for(int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int temp = num;
		    int rev = 0;
			
		    while (temp > 0) {
                int digit = temp % 10;
                rev = rev * 10 + digit;
                temp = temp / 10;
            }

            if (num == rev) {
                count++;
            }
        }

        System.out.println("Palindrome Count = " + count);
    }
}