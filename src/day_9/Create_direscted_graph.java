package day_9;

import java.util.ArrayList;

public class Create_direscted_graph {
	
	/*
	 * WAP to create the directed graph for below friend circle :
	 * A->B->C
	 * B->D
	 * D->E
	 */



		public static void main(String[] args) {

			int V = 5;

			ArrayList<Integer>[] graph = new ArrayList[V];

			for (int i = 0; i < V; i++) {
				graph[i] = new ArrayList<>();
			}

			graph[0].add(1); // A -> B
			graph[1].add(2); // B -> C
			graph[1].add(3); // B -> D
			graph[3].add(4); // D -> E

			char[] name = {'A', 'B', 'C', 'D', 'E'};

			System.out.println(name[0] + "->" + name[1] + "->" + name[2]);
			System.out.println(name[1] + "->" + name[3]);
			System.out.println(name[3] + "->" + name[4]);
		}
	}
		
