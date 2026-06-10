package day_9;
import java.util.*;

import day_9.WeightedGraph.Edge;

public class UniDirected_weighted {
	
	
	
	

		public static void main(String[] args) {
			int V = 3;
			
	ArrayList<Edge>[] graph = new ArrayList[V];
			
			for(int i=0; i<V; i++) {
				graph[i] = new ArrayList<>();
			}
		
			graph[0].add(new Edge(1,5));
			graph[1].add(new Edge(0,5));
			
			graph[1].add(new Edge(2,2));
			graph[2].add(new Edge(1,2));
			
			for(int i=0; i<V; i++) {
				System.out.println(i + " -> ");
				
				for(Edge e: graph[i]) {
					System.out.println("(" + e.dest + "," + e.weight +")");
				}
				System.out.println();
			}

		}

	}


