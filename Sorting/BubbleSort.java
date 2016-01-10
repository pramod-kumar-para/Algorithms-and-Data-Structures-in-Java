
import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {
    public static void sortArray(int array[]){
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                if(array[i]>array[j]){
                    int swap=array[i];
                    array[i]=array[j];
                    array[j]=swap;
                }
            }
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
