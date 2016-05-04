package library;

public class MergeSort extends MetodosOrdenacao{

    private int[] array;
    private int[] tempMergeArray;
    private int length;

    @Override
    public void sort(int[] inputArray) {
        long startTime = System.currentTimeMillis();

        this.array = inputArray;
        this.length = inputArray.length;
        this. tempMergeArray = new int[length];
        doMergeSort(0, length - 1);

        super.elapsedTime = System.currentTimeMillis()-startTime;

    }


    private void doMergeSort(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            doMergeSort(lowerIndex, middle);
            doMergeSort(middle + 1, higherIndex);
            mergeParts(lowerIndex, middle, higherIndex);

        }
    }
        private void mergeParts(int lowerIndex, int middle, int higherIndex) {

            for (int i = lowerIndex; i <= higherIndex; i++) {
                tempMergeArray[i] = array[i];
            }
            int i = lowerIndex;
            int j = middle + 1;
            int k = lowerIndex;
            while (i <= middle && j <= higherIndex) {
                if (tempMergeArray[i] <= tempMergeArray[j]) {
                    array[k] = tempMergeArray[i];
                    i++;
                } else {
                    array[k] = tempMergeArray[j];
                    j++;
                }
                k++;
            }
            while (i <= middle) {
                array[k] = tempMergeArray[i];
                k++;
                i++;
            }

        }
}
