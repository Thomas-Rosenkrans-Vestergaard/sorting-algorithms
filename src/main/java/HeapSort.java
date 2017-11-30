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
		int largestNode = i;
		int leftNode    = 2 * i + 1;
		int rightNode   = 2 * i + 2;

		if (leftNode < n && comparator.compare(array[leftNode], array[largestNode]) == 1)
			largestNode = leftNode;

		if (rightNode < n && comparator.compare(array[rightNode], array[largestNode]) == 1)
			largestNode = rightNode;

		if (largestNode != i) {
			T swap = array[i];
			array[i] = array[largestNode];
			array[largestNode] = swap;

			heapify(array, n, largestNode, comparator);
		}
	}
}
