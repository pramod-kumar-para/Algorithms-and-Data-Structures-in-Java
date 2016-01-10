

import java.util.Arrays;

public class MergeSort {

    public int[] array;
    public int[] tempArray;
    public int length;
    public static void main(String a[]) {
        int[] inputArray = {11,10,9,5,2,1,3};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(inputArray);
        System.out.println(Arrays.toString(inputArray));
    }
    public void sort(int inputArray[]) {
        this.array = inputArray;
        this.length = inputArray.length;
        this.tempArray = new int[length];
        doMergeSort(0, length - 1);


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
        for(int i = lowerIndex; i <= higherIndex; i++) {
            tempArray[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;

        while (i <= middle && j <= higherIndex) {
            if (tempArray[i] <= tempArray[j]) {
                array[k] = tempArray[i];
                i++;    //45,23,11,89,77,98,4,28,65,43
            } else {
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempArray[i];
            k++;
            i++;
            }
        }
}
