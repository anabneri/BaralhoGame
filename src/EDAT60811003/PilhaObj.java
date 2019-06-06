package  EDAT60811003;
public class PilhaObj {

		private Object[] pilhaObj;
		private int topo;
		
		public PilhaObj(int capacidade) {
			pilhaObj = new Object[capacidade];
			topo = -1;    
		}

		
		public boolean isEmpty() {
			return topo == -1;  
		}
		
		public boolean isFull() {
			return topo == pilhaObj.length-1; 
		}
		
	    public void push(Object carta) {
	    	if (isFull()) {
	    		System.out.println("Pilha cheia");
	    	}
	    	else { 
	   
	    		pilhaObj[++topo]= carta; 
	    	}
	    }
	    
	    public Object pop() {
	    	if (isEmpty()) {
	    		System.out.println("Pilha vazia");
	    		return -1;
	    	}
	    	else {
	    		return pilhaObj[topo--];
	
	    	}
	    }
	    
	    public void exibePilhaBaseTopo() {
	    	for (int i = 0; i < pilhaObj.length; i++) {
	    		System.out.println(pilhaObj[i]);
	    	}
	    }
}
	    
