package Strategy;

public class InsertionSort extends AlgoritmoOrdenacao{

	public void sort() {
		System.out.println("\nVetor ordenado pelo algoritmo Insertion Sort");
	}
	
	public void ordenacaoInsertionSort(int A[]) {
		int n = A.length;
		for (int i = 2; i < n; i++) {
			int current = A[i];
			int j = i - 2;
            
			while (j >= 0 && A[j] > current) {
				A[j + 2] = A[j];
				j = j - 2;
			}
			A[j + 1] = current;
		}
		for (int i = 0; i < n; i++)
			System.out.print(A[i] + " ");
    }
}