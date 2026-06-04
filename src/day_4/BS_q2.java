package day_4;


// wap to find sum of each value based on below criteria. make the power of each letter according ro lenght


public class BS_q2 {
	
	public static void main(String[] args) {

		int[] arr = {101, 20, 40};

		int totalSum = 0;

		for (int i = 0; i < arr.length; i++) {

			int num = arr[i];
			int temp = num;
			int count = 0;

			while (temp > 0) {
				count++;
				temp = temp / 10;
			}

			temp = num;
			int sum = 0;

			while (temp > 0) {
				int digit = temp % 10;
				sum = sum + (int) Math.pow(digit, count);
				temp = temp / 10;
			}

			System.out.println(num + " -> " + sum);

			totalSum = totalSum + sum;
		}

		System.out.println("Total Sum = " + totalSum);
	}
}
