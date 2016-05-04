package library;

public abstract class MetodosOrdenacao {
    protected long elapsedTime;
    public  abstract   void sort(int[] vetor) ;

    public long getElapsedTime(){return this.elapsedTime; }


}
