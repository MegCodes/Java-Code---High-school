import java.util.ArrayList;

public class QuickSort {

	public static ArrayList<Integer> quickSort(ArrayList<Integer> list) {
		if (list.size() <= 1) {
			return list;
		} else {
			int pivot = list.get(0);
			ArrayList<Integer> left = new ArrayList<>();
			ArrayList<Integer> right = new ArrayList<>();
			for (int i = 1; i < list.size(); i++) {
				int value = list.get(i);
				if (value < pivot) left.add(value);
				else right.add(value);
			}
			ArrayList<Integer> sorted = new ArrayList<>();
			sorted.addAll(quickSort(left));
			sorted.add(pivot);
			sorted.addAll(quickSort(right));
			return sorted;
		}
	}
	