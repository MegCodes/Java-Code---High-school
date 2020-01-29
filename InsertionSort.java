public class InsertionSort {

	public static void insertionSort(int[] array) {
		System.out.print("Incoming array: ");
		int rightmostPlacedElement = 0;
		printArray(array, rightmostPlacedElement);

		for (int i = 1; i < array.length; i++) {
			int elementToPlace = array[i];
			int j;
			for (j = i - 1; j >= 0 && array[j] > elementToPlace; j--) {
				array[j + 1] = array[j];
			}

			array[j + 1] = elementToPlace;
			rightmostPlacedElement++;
			
			System.out.print("Array now: "); 
			printArray(array, rightmostPlacedElement);
		}
	}
	
	private static void printArray(int[] array, int finishedBoundary) {
		if (array == null) {
			System.out.println("null array");
		} else {
			System.out.print("[");
			if (array.length > 0) System.out.print(array[0]);
			for (int i = 1; i < array.length; i++) {
				String separator = ", ";
				if (i == finishedBoundary + 1) separator = " | ";
				System.out.print(separator + array[i]);
			}
			System.out.println("]");
		}
	}
	