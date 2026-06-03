// WAP  to find the user provided string is palidrome or not. Time complexity should be O(n)




package day_3;

public class palindrom_or_not {
	
	public static void main(String[]args) {
		String str="xyo";
		boolean isPal=isPalidrome(str);
		System.out.println("provider string is palindrom  ::" + isPal);
	}
	
	public static boolean isPalidrome(String checkStr) {
		int left=0,right=checkStr.length()-1;
		while(left<right) {
			if(checkStr.charAt(left)!=checkStr.charAt(right))
			 return false;
			 
			 left ++;
			 right--;
			 
		}
		return true;
		
	}

}
