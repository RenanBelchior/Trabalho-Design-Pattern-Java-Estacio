package Strategy;

public class AlgoritmoOrdenarVetorPrincipal {

	public static void main(String[] args) {
		//Vetor para demonstração de ordenação do Bubble Sort e Insertion Sort 1 ao 20.
	    int[] A = {1,20,19,2,17,3,15,6,14,8,11,10};
	    
	    BubbleSort bs = new BubbleSort();
	    Vetor v = new Vetor(new BubbleSort());
	    v.ordenar();
	    bs.ordenacaoBubbleSort(A);
	    
	    InsertionSort is = new InsertionSort();
	    v.setAlgoritmo(new InsertionSort());
	    v.ordenar();
	    is.ordenacaoInsertionSort(A);
   }
}