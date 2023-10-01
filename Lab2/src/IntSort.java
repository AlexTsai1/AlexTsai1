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
    	for(int i=1;i<arr.length;i++) {
    		int compare = arr[i];
    		int j = i -1;
    		
    		while(j>=0&&arr[j]>compare) {
    			arr[j+1] = arr[j];
    			j--;
    		}
    		arr[j+1]=compare;
    	}
        return arr;
    }
    
    // assumes values in array range from [0,numBuckets]
    public static int[] CountingSort(int[] array, int numBuckets){
    int copy [] =array.clone();
    if(numBuckets< 0) {
    	throw new IllegalArgumentException("Can't be negative");
    }
    int max = copy[0];
    for(int value:copy) {
    	if(value > max)
    		max = value;
    }
    int [] countingsort = new int[max +1 ];
    
    for(int value : copy) {
    	countingsort[value]++;
    }
    
    int index =0;
    for(int i=0; i<=max;i++) {
    	while(countingsort[i]>0) {
    		copy[index]=i;
    		index++;
    		countingsort[i]--;
    	}
    }
    
    	return copy;
    }
    //Data structure and sorting algorithms are visualized at https://cmps-people.ok.ubc.ca/ylucet/DS/Algorithms.html
	//in particular see insertion and counting sort

}
