public class BubbleSort {

	public static void bubbleSort(int[] array) {
		System.out.print("Incoming array: ");
		printArray(array);
		
		int numberSorted = 0;
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < array.length - 1 - numberSorted; i++) {
				printArray(array, i);
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					sorted = false;
				} 
			}
			numberSorted++;
			System.out.println();
		}
		
		System.out.println("Finished sorting");
		System.out.print("Results: ");
		printArray(array);
	}
	
	private static void printArray(int[] array) {
		printArray(array, -1);
	}
	
	private static void printArray(int[] array, int current) {
		if (array == null) System.out.println("null array");
		System.out.print("[");
		if (array.length > 0) System.out.print(array[0]);
		for (int i = 1; i < array.length; i++) {
			String separator = " ";
			if (i - 1 == current) separator = "-";
			System.out.print(separator + array[i]);
		}
		System.out.println("]");
	}
	