import library.*;

public class Todos {

    public void todosBubbleSort(int[] arrayNum ) {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arrayNum);
        bubbleSort.printVetor();
        bubbleSort.print();
    }

    public void todosInsertSort(int[] arrayNum ) {
        InsertSort insertSort = new InsertSort();
        insertSort.sort(arrayNum);
        insertSort.print();
    }

    public void todosMergeSort(int[] arrayNum ) {
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arrayNum);
        mergeSort.print();
    }

    public void todosQuicksort(int[] arrayNum ) {
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arrayNum);
        quickSort.print();
    }

    public void todosSelectionSort(int[] arrayNum ) {
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(arrayNum);
        selectionSort.print();
    }

}
