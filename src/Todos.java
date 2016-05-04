import helpers.Print;
import helpers.Randon;
import helpers.ReadFile;
import helpers.Time;
import library.*;

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

        bubbleSort.sort(arrayNum);
        print.imprimir("Bubble sort: ", bubbleSort.getElapsedTime());

    }

    public void todosInsertSort(int menuSelect) {
        int[] arrayNum = todosNumber(menuSelect);

        insertSort.sort(arrayNum);
        print.imprimir("Insert sort: ", insertSort.getElapsedTime());
    }

    public void todosMergeSort(int menuSelect) {
        int[] arrayNum = todosNumber(menuSelect);

        mergeSort.sort(arrayNum);
        print.imprimir("Merge sort: ", mergeSort.getElapsedTime());
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

        selectionSort.sort(arrayNum);
        print.imprimir("Selection sort: ", selectionSort.getElapsedTime());
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
