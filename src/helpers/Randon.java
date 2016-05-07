package helpers;

public class Randon {

    private int[] numbers;
    private final  int SIZE;
    private final  int MAX ;

    public Randon(){
        this.SIZE = 100000;
        this.MAX = 200000;

    }

    public  int[] setUp(){
        try{
        numbers = new int[this.SIZE];
        java.util.Random generator = new java.util.Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generator.nextInt(this.MAX);
        }

        return numbers;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
