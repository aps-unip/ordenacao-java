package library;

public abstract class MetodosOrdenacao { //em uma classe abstrata nao posso ter o new pra instancia-la, eu soh herdo as caracterisicaas
    protected long elapsedTime; // atributo protected nao conseguimos acessar de fora...porem conseguimos acessar pela herdadas
    protected  int[] arrayNum;
    public  abstract void sort(int[] vetor);//

    public long getElapsedTime(){
        return this.elapsedTime; }

    // retornando o tempo de execução do tipo de ordenação
    public String print(){
        return "Sort: "+this.getElapsedTime()+" Milesegundos";
    }

    // imprimindo vetor ordenado
    public void printVetor(){
        for (int i: this.arrayNum ) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("\n");
    }


    // um método de cópia do vetor para não alterar o vetorOriginal passado como parâmtetro, pois o vetor é passado como referencia (tipo vetor)
    // sendo assim se vc altera o valor dentro do método altera tb seu valor fora.
    public int[] copy(int[] vetorOriginal){
        int[] vetor = new int[vetorOriginal.length];
        System.arraycopy(vetorOriginal,0,vetor,0,vetorOriginal.length);
        return vetor;
    }

}
