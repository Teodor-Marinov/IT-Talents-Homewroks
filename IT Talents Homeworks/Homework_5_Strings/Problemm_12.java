import java.util.Arrays;
import java.util.Scanner;

public class Problemm_12 {
	// Задача 12:
	// Да се създаде метод, който приема за входни данни число N и
	// връща масив от числа с дължина N, който съдържа всички числа
	// от 1 до N.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		System.out.println(Arrays.toString(arrayCreation(num)));

	}

	static int[] arrayCreation(int num) {
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		return arr;
	}

}
