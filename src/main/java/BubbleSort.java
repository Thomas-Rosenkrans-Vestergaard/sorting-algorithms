import java.util.Comparator;

public class BubbleSort implements SortingAlgorithm
{

	/**
	 * Implementation of bubble-sort algorithm using a provided comparator.
	 *
	 * @param array      The array.
	 * @param comparator The comparator.
	 * @param <T>        The type of the elements in the provided array.
	 */
	@Override public <T> void sort(T[] array, Comparator<T> comparator)
	{
		for (int end = array.length; end > 0; end--) {
			boolean swap = false;
			for (int x = 1; x < end; x++) {
				if (comparator.compare(array[x - 1], array[x]) == 1) {
					T temp = array[x - 1];
					array[x - 1] = array[x];
					array[x] = temp;
					swap = true;
				}
			}

			if (!swap) {
				return;
			}
		}
	}
}
