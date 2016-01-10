
import java.util.Scanner;
import java.util.Arrays;

public class InsertionSort {

    public static void sortArray(int array[]){
      for(int i=0;i<array.length;i++)  {
            int pivot=array[i];
            int j=i-1;
            while(j>=0 && array[j]>pivot){
                array[j+1]=array[j];
                j--;
            }
                array[j+1]=pivot;
      }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String... args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int sizeOfArray=scanner.nextInt();
        System.out.println("Enter the elements to be sorted \n");
        int arrayToBeSorted[]=new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++){
            arrayToBeSorted[i]=scanner.nextInt();
        }
        sortArray(arrayToBeSorted);
    }



}
