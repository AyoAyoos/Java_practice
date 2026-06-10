package day_9;

import java.util.ArrayList;

public class DFS_Demo {
	
	static void dfs(ArrayList<Integer>[] graph,
						int node,
						boolean[] visited) {
		
		visited[node] = true;
		
		System.out.print(node + " ");
		
		for ( int neighbor : graph[node]) {
			
			if(!visited[neighbor]) {
				dfs(graph,neighbor,visited);
			}
		}
	}
	
	public static void main(String[]args) {
		
		int V = 4;
		ArrayList<Integer>[] graph = new ArrayList[V];

		for (int i = 0; i < V; i++) {
			graph[i] = new ArrayList<>();
		}
		graph[0].add(1);
		graph[1].add(0);
		
		graph[0].add(2);
		graph[2].add(0);
		
		graph[2].add(3);
		graph[3].add(2);
		
		boolean[] visited = new boolean[V];
		
		dfs(graph,0,visited);
		
	}

}
