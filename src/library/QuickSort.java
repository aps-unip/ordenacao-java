package library;

public class QuickSort extends MetodosOrdenacao {

    @Override
    public void sort(int[] vetorOriginal){
        int[] vetor = super.copy(vetorOriginal);
        this.sort(vetor,0,vetor.length-1);
    }

    public  void sort(int[] vetor, int inicio, int fim) {
        long startTime = System.currentTimeMillis();
        if (inicio < fim){
            int base = separe(vetor, inicio, fim);
            sort(vetor, inicio, base - 1);
            sort(vetor, base + 1, fim);
        }
        super.elapsedTime = System.currentTimeMillis()-startTime;
        this.arrayNum = vetor;
    }
    public  int separe(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while(i <= f){
            if(vetor[i] <= pivo){
                i++;
                f--; // adicionado para não dar erro
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

    public String print(){
        System.out.println("Quick "+super.print());
        return null;
    }
}
