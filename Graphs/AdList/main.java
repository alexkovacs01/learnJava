package it.graphs;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// l'obbiettivo è quello di rappresentare una lista di adiacenza
		// le liste di adiacenza hanno al loro interno delle linked list 
		// ciascuna linked list ha un solo nodo in testa 
		
		// andiamo a istanziare un graffo nuovo
		
		Graph graffo = new Graph();
		
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
		
	}

}
