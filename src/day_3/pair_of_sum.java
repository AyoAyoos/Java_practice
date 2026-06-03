package day_3;

public class pair_of_sum {
	
	public static void main(String[] args) {

        int[] arr = {3, 5, 5, 9, 10};
        int target = 10;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target)
                break;

            if (sum < target)
                left++;
            else
                right--;
        }

        if (left < right)
            System.out.println(arr[left] + " " + arr[right]);
        else
            System.out.println("No pair found");
    }
}