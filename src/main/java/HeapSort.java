import java.util.Comparator;

public class HeapSort implements SortingAlgorithm
{

	/**
	 * Implementation of heap-sort algorithm using a provided comparator.
	 *
	 * @param array      The array.
	 * @param comparator The comparator.
	 * @param <T>        The type of the elements in the provided array.
	 */
	@Override public <T> void sort(T[] array, Comparator<T> comparator)
	{
		int n = array.length;

		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(array, n, i, comparator);

		for (int i = n - 1; i >= 0; i--) {
			T temp = array[0];
			array[0] = array[i];
			array[i] = temp;

			heapify(array, i, 0, comparator);
		}
	}

	private <T> void heapify(T[] array, int n, int i, Comparator<T> comparator)
	{
		int largest = i;
		int l       = 2 * i + 1;
		int r       = 2 * i + 2;

		if (l < n && comparator.compare(array[l], array[largest]) == 1)
			largest = l;

		if (r < n && comparator.compare(array[r], array[largest]) == 1)
			largest = r;

		if (largest != i) {
			T swap = array[i];
			array[i] = array[largest];
			array[largest] = swap;

			heapify(array, n, largest, comparator);
		}
	}
}
