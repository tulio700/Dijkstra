
public class Vertice {

	private int id;
	private Nodes [] vizinhos;
	private int indexInHeap;
	private int key;
	private Vertice pre;
	
	
	
	
	public Vertice(int id) {
		
		this.id= id;

		
	}
	
	public void setIndexHeap(int index) {
		this.indexInHeap = index;
	}
	
	public int getIndexInHeap() {
		return this.indexInHeap;
	}
	
	public void setId(int id) {
		this.id= id;
	}
	
	public void setKey(int k) {
		this.key = k;
	}
	
	public int getKey() {
		return this.key;
	}
	
	public int getId() {
		return this.id;
	}
	
	public Vertice getPre() {
		if(this.pre== null) System.out.println(this.id);;
		return this.pre;
	}
	
	public void setPre(Vertice v) {
		this.pre=v;
	}
	
	public Nodes[] getVizinhos() {
		return this.vizinhos;
	}
	
	public void setVizinhos(Nodes [] n) {
		this.vizinhos= n;
	}
}
