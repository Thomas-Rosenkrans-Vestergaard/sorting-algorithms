import java.util.Comparator;

public class CocktailSort implements SortingAlgorithm
{

	/**
	 * Implementation of cocktail-sort algorithm using a provided comparator.
	 *
	 * @param array      The array.
	 * @param comparator The comparator.
	 * @param <T>        The type of the elements in the provided array.
	 */
	@Override public <T> void sort(T[] array, Comparator<T> comparator)
	{
		int end   = array.length;
		int start = 1;

		while (true) {

			boolean swap = false;
			for (int x = start; x < end; x++) {
				if (comparator.compare(array[x - 1], array[x]) == 1) {
					T temp = array[x - 1];
					array[x - 1] = array[x];
					array[x] = temp;
					swap = true;
				}
			}

			end--;
			if (!swap) {
				return;
			}

			for (int x = end - 1; x >= start; x--) {
				if (comparator.compare(array[x - 1], array[x]) == 1) {
					T temp = array[x - 1];
					array[x - 1] = array[x];
					array[x] = temp;
					swap = true;
				}
			}

			start++;
			if (!swap) {
				return;
			}
		}
	}
}
