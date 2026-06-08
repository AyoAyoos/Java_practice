package day_7;

import java.util.HashSet;

public class Find_Duplicate_using_set {
	
	public static void main(String[] args) {
		
		int[] arr= {10,60,90,89,6,5,10} ;
		HashSet hashSetObj= new HashSet();
		for(int i = 0; i < arr.length;i++) {
			if(!hashSetObj.add(arr[i]))
				System.out.println(arr[i]);
		}
	}

}
