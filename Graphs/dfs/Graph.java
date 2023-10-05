package it.graphs;

import java.util.ArrayList;

public class Graph {

	// questa volta useremo le matrici di adiacenza per poi fare DFS 
	// non liste di adiacenza, il concetto è simile 
	
	ArrayList<Node> nodes; 
	int[][] matirx; 
	
	public Graph(int size) {
		// TODO Auto-generated constructor stub
		nodes = new ArrayList<>();
		this.matirx = new int[size][size];
	
	}
	
	public void addNode(Node node) {
		nodes.add(node);
	}
	
	public void addEdge(int src, int dst) {
		matirx[src][dst] = 1;
	}
	
	public boolean cehckNode(int src, int dst) {
		if (matirx[src][dst] == 1)
			return true;
		else 
			return false;
	}
	
	public void print() {
		
		System.out.print("  ");
		for (Node node: nodes) {
			System.out.print(node.toChar() + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < matirx.length; i++) {
			System.out.print(this.nodes.get(i).data + " ");
			for (int j = 0; j < matirx[i].length; j++) {
				System.out.print(matirx[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public void dFS(int src) {
		boolean[] visited = new boolean[matirx.length];
		dFSHelper(src, visited);
		
	}

	private void dFSHelper(int src, boolean []visited) {
		
		if (visited[src] == true) {	// se l'ho già visitato fine
			return;
		}
		else {
			visited[src] = true;	// altrimento ho appena visitato l'iesimo nodo
			System.out.println(nodes.get(src).data + " = visited");	// stampo che il nodo + = visitato
		}
		
		for (int i = 0; i < matirx[src].length; i++) {
			if (matirx[src][i] == 1) { // src is the row, i is the column
				dFSHelper(i,visited);	// ricorsione
			}
			
		}
		
		return;
	}
	
	
}

