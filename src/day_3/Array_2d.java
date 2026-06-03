package day_3;

public class Array_2d {
	
	
	public static void main(String[]args) {
		
		int[][] arr= new int [3][2];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j]=21;
				
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
				
			}
			System.out.println();

	}
	}
}