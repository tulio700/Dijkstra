

public class MinHeap {

    private Vertice [] list;
    private int size;
    
    public MinHeap(int max) {
    	
    	this.size=0;
        this.list = new Vertice [max];
    }
    
    public MinHeap(Vertice [] ver) {
    	this.list=ver;
    	this.size=ver.length;
    	biuldHeap();
    }
    
    public MinHeap() {
    	size=0;
    }

    public void insert(Vertice item) {
    	increaseKey(size++, item);
    }
    
    
 
    private void minHeapify(int n, int i) {

        int esq = 2*i+1;
        int dir = 2*i+2;
        int menor = i;

        
        if (esq < n && list[esq].getId() < list[menor].getId()) {
            menor = esq;
            
        } else {
            menor = i;
        }if (dir < n && list[dir].getId() < list[menor].getId()) {
            menor = dir;
        }if (menor != i) {
        	Vertice temp = list[i]; 
            list[i] = list[menor]; 
            //list[i].setIndexHeap(i);
            list[menor] = temp; 
            //list[menor].setIndexHeap(menor);
          
            minHeapify( n , menor);
        }
    }

    public boolean isEmpty() {

        return size == 0;
    }

    
    public void heapSort() {
    	
    	biuldHeap();
    	for(int i = this.size-1; i>0 ; i--) {
    		 Vertice temp = list[0]; 
             list[0] = list[i]; 
             list[i] = temp; 
    	
             minHeapify( i, 0); 
    	}
    }
    
    public Vertice extractMin() {
    	if(size<1) return null;
    	Vertice min = list[0];
    	list[0] = list[size-1];
    	size--;
    	minHeapify(size,0);
    	return min;
    }
    
    public void increaseKey(int i, int key) {
    	if(key> list[i].getId()) return;
    	list[i].setId(key);
    	while(i>1 && list[getPai(i)].getId() > list[i].getId() ) {
    		swap(i , getPai(i));
    		i = getPai(i);
    	}
    }
    
    public void increaseKey(int i, Vertice key) {
    	
    	list[i]= key;
    	//key.setIndexHeap(i);
    	while(i>1 && list[getPai(i)].getId()>list[i].getId() ) {
    		swap(i , getPai(i));
    		i=getPai(i);
    	}
    }
    
    public int length() {
    	return this.size;
    }
    
    public void biuldHeap() {
    	for (int i = size / 2 - 1; i >= 0; i--) 
            minHeapify( size, i); 
    }
    
    public int getPai(int i) {
    	return (i/2);
    }
    
    public void swap(int i , int j) {
    	Vertice tmp = list[i];
        list[i] = list[j];
        //list[i].setIndexHeap(i);
        list[j] = tmp; 
        //list[j].setIndexHeap(j);
    }
    
    public void swap(int i , Vertice j) {
    	Vertice tmp = list[i];
        list[i] = j;
        
        j = tmp; 
    }
    
    public void print() 
    { 
        for (int i = 1; i <= size / 2; i++) { 
            System.out.print(" PARENT : " + list[i] 
                             + " LEFT CHILD : " + list[2 * i] 
                             + " RIGHT CHILD :" + list[2 * i + 1]); 
            System.out.println(); 
        } 
    } 
    
    public Vertice getIndex(int index) {
    	return list[index];
    }
    
    public int size() {
    	return this.size;
    }
    
}
