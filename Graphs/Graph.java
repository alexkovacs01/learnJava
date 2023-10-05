package it.graphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {

	// creo la struttura che deve contenere il mio grafo
	ArrayList<LinkedList<Node>> graffo; 
	
	public Graph() {
		// TODO Auto-generated constructor stub
		
		// dobbiamo istanziare i nostri campi o con la new o con this. = 
		
		graffo = new ArrayList<>();
		
	}
	
	// dichiariamoci i metodi 
	
	public void addNode(Node node) {
		LinkedList<Node> currentList = new LinkedList<Node>();

		currentList.add(node);	// viene aggiunto in testa 
		
		graffo.add(currentList);	// lo aggiungo in testa al ArrayList 
		
	
	}
	
	public void addEdge(int src,int dst) {
		
		LinkedList<Node> currentList = graffo.get(src);	// prende la testa 
		
		Node dstNode = graffo.get(dst).get(0);	// la posizione del nodo che vogliamo aggiungere 
		
		// DOBBIAMO AGGIUNGERLO QUINDI IN CODA ALLA NOSTRA LISTA 
		
		currentList.addLast(dstNode);
	
		
	}
	
	public boolean checkEdge(int src,int dst) {
		
		LinkedList<Node> currentList = graffo.get(src);	// prendiamo la testa della lista 
		// poi prendiamo la destinazione per poter cercare 
		Node dstNode = graffo.get(dst).get(0);
		
		// abbiamo la testa e la coda 
		
		for (Node n: currentList) {
			if (n == dstNode) {	// controlliamo l'indirizzo
				return true;
			}
		}	
		return false;		
	}
	
	public void print() {
		// iteriamo per ciascuna linkedList presente nel grafo
		for (LinkedList<Node> currentList : graffo) {
			// iteriamo per ciascun nodo presente nella enn-esima linked list 
			for (Node n: currentList) {
				System.out.print(n.toChar() + " -> ");
			}
			System.out.println();
		}	
	}

}
