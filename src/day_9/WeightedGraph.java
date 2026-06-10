package day_9;

import java.util.ArrayList;

public class WeightedGraph {
	
	static class Edge {
		int dest;
		int weight;
		
		Edge(int dest, int weight) {
			this.dest = dest;
			this.weight = weight;

			
		}
	}
	
	public static void main(String[]args) {
		int V = 3;
		
		ArrayList<Edge>[] graph = new ArrayList[V];
		
		for (int i = 0; i < V; i++) {
			graph[i] = new ArrayList<>();
		}
		graph[0].add(new Edge(1,5));
		graph[0].add(new Edge(2,2));
		
		graph[1].add(new Edge(2,6));
		graph[1].add(new Edge(2,3));
		
		graph[2].add(new Edge(2,6));
		graph[2].add(new Edge(2,3));
		
		for (int i = 0; i < V; i++) {
			System.out.println( i + "->" );
			
			for(Edge e : graph[i]) {
				System.out.println("(" + e.dest + "," + e.weight +")");
			}
			System.out.println();
		}
	}

}
