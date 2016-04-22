
public class SelectionSort {

    public void sort(int[] vetor) {
        long tempoinicial = System.currentTimeMillis();
        for (int i = 0; i < vetor.length; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int tmp = vetor[indiceMinimo];
            vetor[indiceMinimo] = vetor[i];
            vetor[i] = tmp;
        }

    }
}
