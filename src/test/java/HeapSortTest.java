import org.junit.Test;

import static org.junit.Assert.*;

public class HeapSortTest
{
	@Test
	public void sort() throws Exception
	{
		Integer[]  input    = new Integer[]{9, 7, 4, 8, 2};
		Integer[]  expected = new Integer[]{2, 4, 7, 8, 9};
		HeapSort sorting  = new HeapSort();
		sorting.sort(input, Integer::compare);
		assertArrayEquals(input, expected);
	}
}