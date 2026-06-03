

// find how many suffix is 0
// arr={1,90,4,5,60,7,50,60,40}

package dsa_day1;

public class array_q4 {

    public static void main(String[] args) {

        int[] arr = {1,90,4,5,60,7,50,60,40};

        int count = 0;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] % 10 == 0) {
                count++;
            }
        }

        System.out.println("Total numbers ending with 0 = " + count);
    }
}
	
	
