package day_9;

import java.util.ArrayList;

public class Directed_Graph {
	
	public static void main(String[] args) {
		
		int v =3 ;
		
		ArrayList<Integer>[] graph = new ArrayList[v];
		
		for (int i = 0; i < v ; i++) {
			graph[i] = new ArrayList<>();
		}
		
		graph[0].add(1);
		graph[0].add(2);
		graph[1].add(9);
		graph[1].add(7);
		
		
		for(int i =0 ; i< v ; i++) {
			System.out.println( i + "->" + graph[i]);
		}
	}

}
