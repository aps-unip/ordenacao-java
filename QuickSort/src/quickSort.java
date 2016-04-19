/**
 * Created by RodrigoGuimaraes
 */

public class quickSort {
    public static void main(String[] args) {
        int qtd = 100000;
        int[] vetor = new int[qtd];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * qtd);
            //System.out.println(vetor[i]);
        }
        long timeStart = System.currentTimeMillis();
        quickSort(vetor,0,vetor.length-1);
        long timeFinish = System.currentTimeMillis();
        System.out.println("Tempo de execução: " + (timeFinish - timeStart) + " ms");
    }
    private static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim){
            int base = separe(vetor, inicio, fim);
            quickSort(vetor, inicio, base - 1);
            quickSort(vetor, base + 1, fim);
        }
    }
    private static int separe(int[] vetor, int inicio, int fim) {
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
