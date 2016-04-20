import java.util.Scanner;

public class Menu {


    public int menu() {

        System.out.println("Selecione a opção desejada\n");
        System.out.println("1 - Utilizando um arquivo\n");
        System.out.println("2 - Utilizando código para gerar numeros randomicos\n");
        System.out.println("Sua escolha foi: ");

        Scanner ler = new Scanner(System.in);

        int escolha = ler.nextInt();
        return escolha;
    }

}
