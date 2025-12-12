package ABC;

public class C {

	static int binarySearch(int list[], int key) {
		int low, high, middle; // 1
		low = 0;
		high = list.length - 1;

		while (low <= high) { // 2
			middle = (low + high) / 2; // 3
			if (key == list[middle]) // 4
				return middle; // 5
			else if (key > list[middle]) // 6
				low = middle + 1; // 7
			else
				high = middle - 1; // 8
		}
		return 1; // 9
	} // 10
	static int returnOne() {
		return 1;
	}
}
