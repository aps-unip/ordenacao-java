import java.util.Scanner;

public class Menu {


    public int menu() {

        System.out.println("Selecione a opção desejada\n");
        System.out.println("1 - Utilizando um arquivo");
        System.out.println("2 - Utilizando código para gerar numeros randomicos\n");
        System.out.println("Sua escolha é: ");

        Scanner ler = new Scanner(System.in);

        int escolha = ler.nextInt();
        return escolha;
    }



    public int selectMetodo() {

        System.out.println("Selecione o método de ordenação desejada\n");
        System.out.println("1 - Bubble sort");
        System.out.println("2 - Insert sort");
        System.out.println("3 - Merge sort");
        System.out.println("4 - Quick sort");
        System.out.println("5 - Selection sort");
        System.out.println("6 - Todos\n");
        System.out.println("Sua escolha é: ");


        Scanner ler = new Scanner(System.in);

        int escolhaMetodo = ler.nextInt();

        return escolhaMetodo;
    }





}
