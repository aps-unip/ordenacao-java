package helpers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public static int[] scan()  {
        try {
            Scanner scanner = new Scanner(new File("files/teste.txt"));
            int[] tall = new int[100000];
            int i = 0;
            while (scanner.hasNextInt()) {
                tall[i++] = scanner.nextInt();
            }
            return tall;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }

    }

}
