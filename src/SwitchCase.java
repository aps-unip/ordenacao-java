import helpers.Randon;
import helpers.ReadFile;
import library.*;

public class SwitchCase {

    public  int firstSwitch() throws Exception {
        ReadFile file = new ReadFile();
        Randon randon = new Randon();
        Menu menu = new Menu();

        int menuSelect = menu.selectMetodo(); // 1 - 6 métodos
        int menuOption = menu.menu(); // 1 - 2 file/vetor

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
                System.out.println("Opção inválida, escolha 1 ou 2.");
        }
        return menuOption;
    }

    public  void secondSwitch(int menuSelect,int menuOption, int[] arrayNum) throws Exception {

        MergeSort mergeSort = new MergeSort();
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        QuickSort quickSort = new QuickSort();
        InsertSort insertSort = new InsertSort();
        Todos todos = new Todos();

        switch (menuSelect) {

            case 1:
                //bubble
                bubbleSort.sort(arrayNum);
                bubbleSort.printVetor();
                bubbleSort.print(); // retornando o tempo de execução do tipo de ordenação
                break;
            case 2:
                //Insert
                insertSort.sort(arrayNum);
                insertSort.printVetor();
                insertSort.print();

                break;
            case 3:
                //Merge
                mergeSort.sort(arrayNum);
                mergeSort.printVetor();
                mergeSort.print();
                break;
            case 4:
                //Quick
                quickSort.sort(arrayNum);
                quickSort.printVetor();
                quickSort.print();
                break;
            case 5:
                //Selection
                selectionSort.sort(arrayNum);
                selectionSort.printVetor();
                selectionSort.print();
                break;

            case 6:
                //Todos

                int[] vetor = this.trataSecondSwitch(menuOption);

                todos.todosBubbleSort(vetor);
                todos.todosInsertSort(vetor);
                todos.todosMergeSort(vetor);
                todos.todosQuicksort(vetor);
                todos.todosSelectionSort(vetor);
                break;

        }

    }

    public int[] trataSecondSwitch(int menuSelect) {
        int[] arrayNum;
        ReadFile file = new ReadFile();
        Randon randon = new Randon();

        switch (menuSelect) {

            case 1:
                arrayNum = file.scan();
                break;

            case 2:
                arrayNum = randon.setUp();
                break;
            default:
                arrayNum=null;
                break;
        }
        return arrayNum;
    }
}