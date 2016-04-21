import java.io.FileNotFoundException;

public class SwitchCase {

    public int firstSwitch() throws Exception {



        ReadFile file = new ReadFile();
        Randon randon = new Randon();
        Menu menu = new Menu();


        int menuSelect = menu.selectMetodo(); // 1 - 6 metodos
        int menuOption = menu.menu(); // 1 - 2 file



        int[] arrayNum;

        switch (menuOption){
            case 1:
                arrayNum = file.scan();
                secondSwitch(menuSelect, arrayNum);
                break;
            case 2:
                arrayNum = randon.setUp();
                secondSwitch(menuSelect, arrayNum);
                break;
            default:
                System.out.println("Opção invalida, escolha 1 ou 2.");
        }
        return 0;
    }



    public void secondSwitch(int menuSelect, int[] arrayNum) {

        long startTime;
        long stopTime;
        long elapsedTime;
        long elapsedTimeBubble;
        long elapsedTimeInsert;
        long elapsedTimeMerge;
        long elapsedTimeQuick;
        long elapsedTimeSelection;

        Time time = new Time();

        MergeSort mergeSort = new MergeSort();
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        QuickSort quickSort = new QuickSort();
        InsertSort insertSort = new InsertSort();

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
                System.out.println("\nMerge sort: " + elapsedTime + " Milesegundos");

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
                startTime = time.start();
                quickSort.sort(arrayNum, 0, arrayNum.length - 1);
                stopTime = time.stop();
                elapsedTimeQuick = stopTime - startTime;

                startTime = 0;
                stopTime = 0;
                startTime = time.start();
                bubbleSort.sort(arrayNum);
                stopTime = time.stop();
                elapsedTimeBubble = stopTime - startTime;

                startTime = 0;
                stopTime = 0;
                startTime = time.start();
                insertSort.sort(arrayNum);
                stopTime = time.stop();
                elapsedTimeInsert = stopTime - startTime;


                startTime = 0;
                stopTime = 0;
                startTime = time.start();
                mergeSort.sort(arrayNum);
                stopTime = time.stop();
                elapsedTimeMerge = stopTime - startTime;

                startTime = 0;
                stopTime = 0;
                startTime = time.start();
                selectionSort.sort(arrayNum);
                stopTime = time.stop();
                elapsedTimeSelection = stopTime - startTime;

                System.out.println("\nBubble sort: " + elapsedTimeBubble + " Milesegundos");
                System.out.println("\nInsert sort: " + elapsedTimeInsert + " Milesegundos");
                System.out.println("\nMerge sort: " + elapsedTimeMerge + " Milesegundos");
                System.out.println("\nQuick sort: " + elapsedTimeQuick + " Milesegundos");
                System.out.println("\nSelection sort: " + elapsedTimeSelection + " Milesegundos");
                break;

        }

    }
}