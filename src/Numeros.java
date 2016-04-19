public class Numeros {

    private int[] numbers;
    private final static int SIZE = 100000;
    private final static int MAX = 200000;

    public int[] setUp() throws Exception {
        numbers = new int[SIZE];
        java.util.Random generator = new java.util.Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generator.nextInt(MAX);
        }

        return numbers;
    }
}