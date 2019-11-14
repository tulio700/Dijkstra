

import java.util.ArrayList;

public class Grafo {

	private Vertice [] vertices;
	private int [] distancia;
	
	public Grafo() {
		
	}
	
	public Grafo( Vertice []v) {
		this.vertices = v;
		this.distancia = new int [this.vertices.length];
	}
	
	 public void dijkstra(int inicio) {
		 
		 MinHeap heap = new MinHeap(vertices.length);
		 Vertice last = new Vertice(0);
		 ArrayList<Vertice> pilha = new ArrayList<Vertice>();
		 for(int i = 0 ; i< this.vertices.length ; i++) {
			 
			 vertices[i].setKey(10000);		
			 distancia[i] = 0;
			// heap.insert(this.vertices[i]);
			 
		 }
		
		 vertices[inicio].setKey(0);
		 vertices[inicio].setPre(null);
		 Vertice u;
		 
		 while(!heap.isEmpty()) {
			u = heap.extractMin();
			 
			 for(Nodes v: u.getVizinhos()) {
				 
				 int peso = v.getPeso();
				 Vertice vizinhoAtual = v.getProx();
				 if(vizinhoAtual.getKey() > u.getKey() + peso) {
					 distancia[vizinhoAtual.getId()]= u.getKey() + peso;
					 heap.increaseKey(vizinhoAtual.getIndexInHeap(),u.getKey() + peso);
					 vizinhoAtual.setPre(u);
				 } 
				 
			 }
			 
			 
		 }
		 
		 for(int i: this.distancia) {
			 System.out.print(i+" ");
		 
		 }
		 last = vertices[vertices.length-1];
		 while(last.getPre()!= null) {
			
			 pilha.add(last);
			 //System.out.print(last.getId()+" -> ");
			 last= last.getPre();
		 }
		 System.out.println();
		 for(int i = pilha.size()-1 ; i >= 0 ; i--) {
			 System.out.print(pilha.get(i).getId()+" -> ");
			 
			 
			 
		 }
		 
		 
	 }
	 
	 
}