import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class InsertionSortTest
{
	@Test
	public void sort() throws Exception
	{
		Integer[]     input    = new Integer[]{9, 7, 4, 8, 2};
		Integer[]     expected = new Integer[]{2, 4, 7, 8, 9};
		InsertionSort sorting  = new InsertionSort();
		sorting.sort(input, Integer::compare);
		assertArrayEquals(input, expected);
	}
}