package library;

public class QuickSort {

    public  void sort(int[] vetor, int inicio, int fim) {
        if (inicio < fim){
            int base = separe(vetor, inicio, fim);
            sort(vetor, inicio, base - 1);
            sort(vetor, base + 1, fim);
        }
    }
    public  int separe(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while(i <= f){
            if(vetor[i] <= pivo){
                i++;
            }else if (pivo < vetor[f]) {
                f--;
            }else{
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }
}
