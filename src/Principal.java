public class Principal {


    public static void main(String[] a) throws Exception {

        long startTime;
        long stopTime;
        long elapsedTime;
        int escolha;

        MergeSort sorter = new MergeSort();
        ReadFile file = new ReadFile();
        Randon randon = new Randon();
        Menu menu = new Menu();
        Time time = new Time();

        escolha = menu.menu();


        switch (escolha) {
            case 1:
                int[] arrayFile = file.scan();
                startTime = time.start();
                sorter.sort(arrayFile);
                stopTime = time.stop();
                elapsedTime = stopTime - startTime;

                for (int i:arrayFile) {
                    System.out.print(i);
                    System.out.print(" ");
                }
                System.out.println("\n");
                System.out.println("\nAtravés de um arquivo txt, Merge sort: " + elapsedTime + " Milesegundos");
                break;

            case 2:
                int[] arrayRandon = randon.setUp();
                startTime = time.start();
                sorter.sort(arrayRandon);
                stopTime = time.stop();
                elapsedTime = stopTime - startTime;

                for (int i:arrayRandon) {
                    System.out.print(i);
                    System.out.print(" ");
                }
                System.out.println("\n");
                System.out.println("\nAtravés de numeros randomicos de um Merge sort: " + elapsedTime + " Milesegundos");
                break;

            default: System.out.println("Opção incorreta, escolha 1 ou 2");

        }



    }
}
