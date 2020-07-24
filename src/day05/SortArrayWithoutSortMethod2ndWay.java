package day05;
import java.util.Arrays;
public class SortArrayWithoutSortMethod2ndWay {
//  write a return method that can sort an array in Ascending order without using the sort method of the Arrays class 
//          Input : {6,2,4,3,1,5} 
//          Output : {1,2,3,4,5,6} 
    public static void main(String[] args) {
        // Create an Arrays
        int arr[] = { 6, 2, 4, 3, 1, 5,3,1 };
        // Call to method
        SortingArray(arr);
    }
    // Create a return method
    public static int SortingArray(int arr[]) {
        int sortTemp = 0;
        // use < with for loops to descending order
        for (int each = 0; each < arr.length - 1; each++) {
            for (int j = 0; j < arr.length - 1; j++) {
                // Write if statement for descending order and Initialize sorting value to sortTemp
                if (arr[j] > arr[j + 1]) {
                    sortTemp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = sortTemp;
                }
            }
        }
        // Print sort an array in ascending order
        System.out.println(Arrays.toString(arr));
        return sortTemp;
    }
}
