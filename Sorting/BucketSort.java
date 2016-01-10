
import java.util.Arrays;
import java.util.Scanner;

class BucketSort{
    public static void sortArray(int sort[],int maxValue){
        int bucket[]=new int[maxValue+1];
        for(int i=0;i<bucket.length;i++){
            bucket[i]=0;
        }
     //   System.out.println(Arrays.toString(bucket));
        for(int j=0;j<sort.length;j++){
            bucket[sort[j]]++;
        }
        int counter=0;
        for(int i=0;i<bucket.length;i++){
            for(int j=0;j<bucket[i];j++){
                sort[counter++]=i;
            }
        }
        System.out.println(Arrays.toString(sort));
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
        System.out.println("Enter maximum value in the array \n");
        int maxValue=scanner.nextInt();
        sortArray(arrayToBeSorted,maxValue);




    }

}
