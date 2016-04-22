import java.io.FileNotFoundException;

public class Todos {

    long startTime;
    long stopTime;
    long elapsedTime;
    int[] arrayNum;

    MergeSort mergeSort = new MergeSort();
    BubbleSort bubbleSort = new BubbleSort();
    SelectionSort selectionSort = new SelectionSort();
    QuickSort quickSort = new QuickSort();
    InsertSort insertSort = new InsertSort();

    ReadFile file = new ReadFile();
    Randon randon = new Randon();

    Print print = new Print();
    Time time = new Time();



    public void todosBubbleSort(int menuSelect) {
        int[] arrayNum = todosNumber(menuSelect);
        startTime = time.start();
        bubbleSort.sort(arrayNum);
        stopTime = time.stop();
        elapsedTime = stopTime - startTime;
        print.imprimir("Bubble sort: ", elapsedTime);

    }

    public void todosInsertSort(int menuSelect) {
        int[] arrayNum = todosNumber(menuSelect);
        startTime = time.start();
        insertSort.sort(arrayNum);
        stopTime = time.stop();
        elapsedTime = stopTime - startTime;
        print.imprimir("Insert sort: ", elapsedTime);
    }

    public void todosMergeSort(int menuSelect) {
        int[] arrayNum = todosNumber(menuSelect);
        startTime = time.start();
        mergeSort.sort(arrayNum);
        stopTime = time.stop();
        elapsedTime = stopTime - startTime;
        print.imprimir("Merge sort: ", elapsedTime);

    }

    public void todosQuicksort(int menuSelect) {
        int[] arrayNum = todosNumber(menuSelect);
        startTime = time.start();
        quickSort.sort(arrayNum, 0, arrayNum.length - 1);
        stopTime = time.stop();
        elapsedTime = stopTime - startTime;
        print.imprimir("Quick sort: ", elapsedTime);
    }

    public void todosSelectionSort(int menuSelect) {
        int[] arrayNum = todosNumber(menuSelect);
        startTime = time.start();
        selectionSort.sort(arrayNum);
        stopTime = time.stop();
        elapsedTime = stopTime - startTime;
        print.imprimir("Selection sort: ", elapsedTime);
    }




    public int[] todosNumber(int menuSelect) {

        switch (menuSelect) {

            case 1:
                try {
                    this.arrayNum = this.file.scan();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                break;

            case 2:

                try {
                    this.arrayNum = this.randon.setUp();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;

        }


        return this.arrayNum;
    }
}
