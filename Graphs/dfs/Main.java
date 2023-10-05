package it.graphs;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Graph graffo = new Graph(5);
		
		graffo.addNode(new Node('A')); // 0
		graffo.addNode(new Node('B')); // 1
		graffo.addNode(new Node('C')); // 2
		graffo.addNode(new Node('D')); // 3
		graffo.addNode(new Node('E')); // 4
		
		graffo.addEdge(0, 1);
		graffo.addEdge(1, 2);
		graffo.addEdge(1, 4);
		graffo.addEdge(4, 0);
		graffo.addEdge(4, 2);
		graffo.addEdge(2, 3);
		graffo.addEdge(2, 4);
		
		graffo.print();
		
		System.out.println();
		
		graffo.dFS(0);
		
	}

}
