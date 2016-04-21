
public class BubbleSort {

    public static void sort(int[] vetor) {
        boolean troca = true;
        int aux, i;
        while (troca) {
            troca = false;
            for (i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }

    }
}
