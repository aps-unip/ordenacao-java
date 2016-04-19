


public class Principal {


    public static void main(String[] a) throws Exception {
        MergeSort sorter = new MergeSort();


//      invocada classe para gerar um array com numeros randomicos
//        Numeros numero = new Numeros();

//      invoca classe para ler um arquivo txt com numeros aleatórios
        ReadFile file = new ReadFile();

//      utilizado para ler arquivo txt com numeros aleatórios
        int[] array = file.scan();

//        utilizado para atribuir numeros randomicos para a variavel array
//        int[] array = numero.setUp(); //


//        uma variavel atribuido um array com alguns numeros para teste
//        int[] array = {45,23,11,89,77,98,4,28,65,43, 56, 45, 64, 78,99, 23, 10, 45, 67, 43, 41, 99, 121, 143, 456, 654};

//        Aqui começa o merge sort

        long startTime = System.currentTimeMillis();
        sorter.sort(array);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;

        for(int i:array) {
            System.out.print(i);
            System.out.print(" ");
        }

        System.out.println("\nMerge sort " + elapsedTime + " milisegundos");

    }
}
