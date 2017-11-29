import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SelectionSortTest
{

	@Test
	public void sort() throws Exception
	{
		Integer[]     input    = new Integer[]{9, 7, 4, 8, 2};
		Integer[]     expected = new Integer[]{2, 4, 7, 8, 9};
		SelectionSort sorting  = new SelectionSort();
		sorting.sort(input, Integer::compare);
		assertArrayEquals(input, expected);
	}
}