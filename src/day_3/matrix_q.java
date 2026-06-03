//WAP to shuffle diagonal element by next position and make it 0 on digonal location 2*2


package day_3;

public class matrix_q {
	
	public static void main(String[]args) {
		
		System.out.println("given matrix ");
		
		int[][] arr= {
				{40,53},
				{86,56},
				
		};	
		for(int i = 0 ; i < arr.length; i++) {
			for(int j=0 ; j < arr[i].length ; j++) {
				
				
				
				if(i==j) {
					if(j+1 < arr[i].length) {
						arr[i][j+1] = arr [i][j];
					}
					arr[i][j] = 0;
				}
			
				System.out.print(arr[i][j] + "\t");
				
			}
			System.out.println();
		}
		
		
	}

}
