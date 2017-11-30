import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest
{
	@Test
	public void sort() throws Exception
	{
		Integer[]  input    = new Integer[]{9, 7, 4, 8, 2};
		Integer[]  expected = new Integer[]{2, 4, 7, 8, 9};
		BubbleSort sorting  = new BubbleSort();
		sorting.sort(input, Integer::compare);
		assertArrayEquals(expected, input);
	}
}