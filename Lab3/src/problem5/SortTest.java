package problem5;

import problem4.Employee;

public class SortTest {
	
	public static <E> void printArray(E[] arr) {
		for(int i = 0; i < arr.length; i++)
			System.out.println(i + ".   " + arr[i]);
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chocolate[] arr1 = {new Chocolate(30, "nyamNyam"),
				new Chocolate(60, "extraNyam"),
				new Chocolate (15, "poorNyam")};
		
		Time[] arr2 = {new Time(1000, 124, 0),
				new Time(1000, 124, 1),
				new Time(1000, 124, 2)};
		
		Employee e1 = new Employee("RichArd", "RichYard 39", "24.11.23"),
				e2 = new Employee("PayMid", "small house 10", "24.11.23"),
				e3 = new Employee("PoorGuy", "homless 97", "24.11.23");
		e1.setSalary(567987.99);
		e2.setSalary(127000.1);
		e3.setSalary(0.001);
		Employee[] arr3 = {e1, e2, e3};
		
//		Sort.heapSort(arr1);
//		Sort.heapSort(arr2);
//		Sort.heapSort(arr3);
		
		Sort.mergeSort(arr1);
		Sort.mergeSort(arr2);
		Sort.mergeSort(arr3);

		printArray(arr1);
		printArray(arr2);
		printArray(arr3);
	}

}
