import helpers.Randon;
import helpers.ReadFile;
import helpers.Time;
import library.*;

public class SwitchCase {

    public  int firstSwitch() throws Exception {



        ReadFile file = new ReadFile();
        Randon randon = new Randon();
        Menu menu = new Menu();


        int menuSelect = menu.selectMetodo(); // 1 - 6 metodos
        int menuOption = menu.menu(); // 1 - 2 file


        int[] arrayNum;

        switch (menuOption){
            case 1:
                arrayNum = file.scan();
                secondSwitch(menuSelect, menuOption,arrayNum);
                break;
            case 2:
                arrayNum = randon.setUp();
                secondSwitch(menuSelect, menuOption, arrayNum);
                break;
            default:
                System.out.println("Opção invalida, escolha 1 ou 2.");
        }
        return menuOption;
    }



    public  void secondSwitch(int menuSelect,int menuOption, int[] arrayNum) throws Exception {

        long startTime;
        long stopTime;
        long elapsedTime;


        Time time = new Time();

        MergeSort mergeSort = new MergeSort();
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        QuickSort quickSort = new QuickSort();
        InsertSort insertSort = new InsertSort();
        Todos todos = new Todos();

        switch (menuSelect) {

            case 1:
                //bubble
                startTime = time.start();
                bubbleSort.sort(arrayNum);
                stopTime = time.stop();
                elapsedTime = stopTime - startTime;
                for (int i:arrayNum) {
                    System.out.print(i);
                    System.out.print(" ");
                }

                System.out.println("\n");
                System.out.println("\nBubble sort: " + elapsedTime + " Milesegundos");

                break;
            case 2:
                //Insert
                startTime = time.start();
                insertSort.sort(arrayNum);
                stopTime = time.stop();
                elapsedTime = stopTime - startTime;
                for (int i:arrayNum) {
                    System.out.print(i);
                    System.out.print(" ");
                }

                System.out.println("\n");
                System.out.println("\nInsert sort: " + elapsedTime + " Milesegundos");
                break;
            case 3:
                //Merge
                startTime = time.start();
                mergeSort.sort(arrayNum);
                stopTime = time.stop();
                elapsedTime = stopTime - startTime;

                for (int i:arrayNum) {
                    System.out.print(i);
                    System.out.print(" ");
                }

                System.out.println("\n");
                System.out.println("\nMerge sort: " + elapsedTime + " Milesegundos");
                break;
            case 4:
                //Quick
                startTime = time.start();
                quickSort.sort(arrayNum, 0, arrayNum.length - 1);
                stopTime = time.stop();
                elapsedTime = stopTime - startTime;
                for (int i:arrayNum) {
                    System.out.print(i);
                    System.out.print(" ");
                }

                System.out.println("\n");
                System.out.println("\nQuick sort: " + elapsedTime + " Milesegundos");
                break;
            case 5:
                //Selection
                startTime = time.start();
                selectionSort.sort(arrayNum);
                stopTime = time.stop();
                elapsedTime = stopTime - startTime;
                for (int i:arrayNum) {
                    System.out.print(i);
                    System.out.print(" ");
                }

                System.out.println("\n");
                System.out.println("\nSelection sort: " + elapsedTime + " Milesegundos");

                break;

            case 6:
                //Todos
                todos.todosBubbleSort(menuOption);
                todos.todosInsertSort(menuOption);
                todos.todosMergeSort(menuOption);
                todos.todosQuicksort(menuOption);
                todos.todosSelectionSort(menuOption);
                break;

        }

    }
}