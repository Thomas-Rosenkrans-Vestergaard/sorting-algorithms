import java.util.Comparator;

public class SelectionSort implements SortingAlgorithm
{

	/**
	 * Implementation of selection sort algorithm using a provided comparator.
	 *
	 * @param array      The array.
	 * @param comparator The comparator.
	 * @param <T>        The type of the elements in the provided array.
	 */
	@Override
	public <T> void sort(T[] array, Comparator<T> comparator)
	{
		for (int x = 0; x < array.length; x++) {
			int minimum = x;
			for (int j = x + 1; j < array.length; j++) {
				if (comparator.compare(array[j], array[minimum]) == -1) {
					minimum = j;
				}

			}

			if (minimum != x) {
				T temp = array[x];
				array[x] = array[minimum];
				array[minimum] = temp;
			}
		}
	}
}
