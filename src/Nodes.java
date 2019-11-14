
public class Nodes {

	private Vertice pre;
	private Vertice prox;
	private int peso;
	
	public Nodes(Vertice pre, Vertice pro , int p) {
		this.prox = pro;
		this.pre = pre;
		this.peso = p;
	}
	
	public Vertice getProx() {
		return this.prox;
	}
	
	public int getPeso() {
		return this.peso;
	}
	
	public Vertice getPre() {
		return this.pre;
	}
}