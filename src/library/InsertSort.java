package library;

public class InsertSort extends MetodosOrdenacao {

    @Override
    public void sort(int[] vetor) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < vetor.length; i++) {
            int atual = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] >= atual) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = atual;;
        }
        super.elapsedTime = System.currentTimeMillis()-startTime;

    }
}
