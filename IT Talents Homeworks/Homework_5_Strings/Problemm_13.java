import java.util.Arrays;

public class Problemm_13 {

	public static void main(String[] args) {
		// Задача 13:
		// Да се създаде метод, който приема два масива от числа и връща
		// масив, съдържащ всички елементи на подадените масиви, като в
		// първата част на масива са елементите на първия подаден масив,
		// а във втората част – тези на втория подаден масив.
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 22, 33, 55 };

		System.out.println(Arrays.toString(combineArrays(arr1, arr2)));
	}

	static int[] combineArrays(int[] arr1, int[] arr2) {
		int[] arr = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			arr[i] = arr1[i];
		}
		for (int i = arr1.length; i < arr.length; i++) {
			arr[i] = arr2[i - arr1.length];
		}
		return arr;
	}
}
