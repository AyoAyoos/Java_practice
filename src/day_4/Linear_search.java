
package day_4;

public class Linear_search {
	
	public static void main(String[]args) {
		
		
		 int[] arr= {5,8,1,9};
		 
		 int target = 9;
		 
		  int index = -1;
		 
		 for(int i = 0; i<arr.length ; i++) {
			 
			 if(arr[i] == target)
				 index = i;
			     break;
		 }
		 
		 if(index != -1) {
			 System.out.println("found index" + index );
		 }
		 else {
			 System.out.println("not found");
		 }
	
	
	
	}

}
