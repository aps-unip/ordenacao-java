package library;

public class BubbleSort extends MetodosOrdenacao {

    @Override
    public  void sort(int[] vetorOriginal) {
        int[] vetor = super.copy(vetorOriginal);

        long startTime = System.currentTimeMillis();

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
        super.elapsedTime = System.currentTimeMillis()-startTime;
        this.arrayNum = vetor;
    }

    public String print(){
        System.out.println("Bubble "+super.print());
        return null;
    }
}
