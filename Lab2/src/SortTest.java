import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class SortTest {
	
	@Test
	public void insertionsorttest(){
		int []input = {5,3,1,2,4};
		int [] expected = {1,2,3,4,5};
		assertArrayEquals(expected, IntSort.InsertionSort(input));
	}
	
	@Test
	public void countingsorttest() {
		int []input = {5,3,1,2,4};
		int [] expected = {1,2,3,4,5};
		assertArrayEquals(expected, IntSort.CountingSort(input, 5));
	}
}
