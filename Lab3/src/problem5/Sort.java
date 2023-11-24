package problem5;

import java.lang.reflect.Array;

public class Sort {
	static <E> void swap(E[] array, int i, int j) {
		E obj = array[i];
		array[i] = array[j];
		array[j] = obj;
	}

	static <E extends Comparable<E>> void heapSort(E[] array) {
		for (int i = array.length / 2 - 1; i >= 0; i--)
			heapify(array, array.length, i);
		for (int i = array.length - 1; i > 0; i--) {
			swap(array, 0, i);
			heapify(array, i, 0);
		}
	}

	static private <E extends Comparable<E>> void heapify(E[] arr, int len, int node) {
		int max = node, left = node * 2 + 1, right = (node + 1) * 2;
		if (left < len && arr[left].compareTo(arr[max]) == 1)
			max = left;
		if (right < len && arr[right].compareTo(arr[max]) == 1)
			max = right;
		if (max != node) {
			swap(arr, node, max);
			heapify(arr, len, max);
		}
	}

	static <E extends Comparable<E>> void mergeSort(E[] array) {
		mergeSort(array, 0, array.length - 1);
	}

	static <E extends Comparable<E>> void mergeSort(E[] array, int left, int right) {
		if (left < right) {
			int middle = (left + right) >>> 1;
			mergeSort(array, left, middle);
			mergeSort(array, middle + 1, right);
			merge(array, left, middle, right);
		}
	}

	static private <E extends Comparable<E>> void merge(E[] arr, int l, int m, int r) {
		int n1 = m - l + 1, n2 = r - m;

		Class<?> compType = arr.getClass().componentType();
		@SuppressWarnings("unchecked")
		E[] left = (E[]) Array.newInstance(compType, n1);
		@SuppressWarnings("unchecked")
		E[] right = (E[]) Array.newInstance(compType, n2);

		for (int i = 0; i < n1; i++)
			left[i] = arr[l + i];
		for (int i = 0; i < n2; i++)
			right[i] = arr[m + 1 + i];

		int i = 0, j = 0, k = l;
		while (i < n1 && j < n2) {
			if (left[i].compareTo(right[j]) == -1)
				arr[k++] = left[i++];
			else
				arr[k++] = right[j++];
		}

		while (i < n1)
			arr[k++] = left[i++];
		while (j < n2)
			arr[k++] = right[j++];
	}
}
