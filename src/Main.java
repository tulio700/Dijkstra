public class Main
{
	public static void main (String[] args)
	{
		
		Grafo grafo;
		
		Vertice v0 = new Vertice (0); 
		Vertice v1 = new Vertice (1);
		Vertice v2 = new Vertice (2); 
		Vertice v3 = new Vertice (3);
		Vertice v4 = new Vertice (4); 
		
		Nodes n1 = new Nodes(v0,v1,10);
		Nodes n2 = new Nodes(v0,v2,5);
		Nodes n4 = new Nodes(v1,v2,2);
		Nodes n5 = new Nodes(v1,v3,1);
		Nodes n6 = new Nodes(v2,v1,3);
		Nodes n7 = new Nodes(v2,v3,9);
		Nodes n8 = new Nodes(v2,v4,2);
		Nodes n9 = new Nodes(v3,v4,4);
		Nodes n10 = new Nodes(v4,v3,6);
		Nodes n11 = new Nodes(v4,v0,7);
		
		
		
		Nodes [] a = {n1,n2};
		Nodes [] b = {n4,n5};
		Nodes [] c = {n6,n7,n8};
		Nodes [] d = {n9};
		Nodes [] e = {n10,n11};
		
		v0.setVizinhos(a);
		v1.setVizinhos(b);
		v2.setVizinhos(c);
		v3.setVizinhos(d);
		v4.setVizinhos(e);
		
		
		Vertice [] vertices = {v0,v1,v2,v3,v4};
		
		
		grafo = new Grafo(vertices);
		
		
		grafo.dijkstra(0);
		
	}
}