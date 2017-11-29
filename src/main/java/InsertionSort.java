import java.util.Comparator;

public class InsertionSort implements SortingAlgorithm
{
	@Override public <T> void sort(T[] array, Comparator<T> comparator)
	{
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0 && comparator.compare(array[j - 1], array[j]) == 1; j--) {
				T temp = array[j - 1];
				array[j - 1] = array[j];
				array[j] = temp;
			}
		}
	}
}
