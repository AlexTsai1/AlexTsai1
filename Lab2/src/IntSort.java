import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
/**
 * Note that an array of integers are expected
 * 
 * Remember to site sources if you use code from online!
 */
public class IntSort {

	//you may use this to check that your test cases are correct
    public static int[] sort(int[] arr){
    	int[] arrCopy = arr.clone();
        Arrays.sort(arrCopy);
        return arrCopy;
    }

    public static int[] InsertionSort(int[] orgArr){
        //TODO: implement insertion sort as described at https://en.wikipedia.org/wiki/Insertion_sort
    	int[] arr = orgArr.clone();
    	
    	// SORT HERE //
    	
    	// return arr sorted
        return arr;
    }
    
    // assumes values in array range from [0,numBuckets]
    public static int[] CountingSort(int[] array, int numBuckets){
    //TODO: implement counting sort as described at any of the following links:
	//http://www.personal.kent.edu/~rmuhamma/Algorithms/MyAlgorithms/Sorting/countingSort.htm
	//https://en.wikipedia.org/wiki/Counting_sort
    	
    	// Ensure not to alter the original array
    	return null;
    }
    //Data structure and sorting algorithms are visualized at https://cmps-people.ok.ubc.ca/ylucet/DS/Algorithms.html
	//in particular see insertion and counting sort

}
