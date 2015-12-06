
public class Problemm_11 {

	// Задача 11:
	// Да се създаде метод, който отпечатва масив в конзолата.

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 6, 4, 2, 1, 12 };
		printArray(arr);

	}

}
