package day_4;


//WAP reverse the alternative substring
//I/P ;- india is my country
//O/p :- india si my yrtnuoc


public class LS_q4 {
	
	public static void main(String[] args) {

        String str = "india is my country";

        String[] words = str.split(" ");

        for (int i = 1; i < words.length; i = i + 2) {

            char[] arr = words[i].toCharArray();

            int left = 0;
            int right = arr.length - 1;

            while (left < right) {

                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }

            words[i] = new String(arr);
        }

        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
    }
}