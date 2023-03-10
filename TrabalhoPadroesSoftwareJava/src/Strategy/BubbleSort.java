package Strategy;

public class BubbleSort extends AlgoritmoOrdenacao{
	
	public void sort() {
		System.out.print("Vetor ordenado pelo algoritmo Bubble Sort: \n");
	}
	
	public void ordenacaoBubbleSort(int[] A) {
	    
		for(int j = 0; j < A.length - 1; j++) {
		      
		      for(int i = 0; i < A.length - 1 - j; i++) {
		       
		        if(A[i] > A[i + 1]) {
		          int aux = A[i];
		          A[i] = A[i + 1];
		          A[i + 1] = aux;
		        }
		      }
		    }
		    for(int num : A){
			      System.out.print(num + " ");
		}
    }
}