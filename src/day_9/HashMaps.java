package day_9;


	
	
	

	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;

	public class HashMaps {

		
			static Map<Integer, List<Integer>> graph = new HashMap<>();
			
			static void addEdge(int u, int v) {
			graph.putIfAbsent(u,  new ArrayList<>());
			graph.putIfAbsent(v,  new ArrayList<>());
			
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
	public static void main(String[] args) {
		addEdge(1,2);
		addEdge(1,3);
		addEdge(2,4);
		addEdge(3,5);
		
		System.out.println(graph);
		
	}
		

	}

