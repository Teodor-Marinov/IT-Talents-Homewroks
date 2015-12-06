
public class Problem_3 {

	public static void main(String[] args) {
		// Задача 3:
		//
		// Имате двумерен масив от числа, чийто стойности са въведени
		// предварително. Да се отпечатат сумата на елементите на масива,
		// както и средноаритметичното на тези числа.

		int arr[][] = { { 12, 54, 2, -23, 45 }, { 75, 4, 42, 45, 0 }, { 12, -123, 987, 234, 34 },
				{ 12, -34, 12, -23, 45 }, { 34, 54, -213, 9, -1 }, { 12, 65, 56, 45, -352 }, };

		int sum = 0;

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j];
				count++;

			}

		}

		System.out.println("Sum = " + sum);
		System.out.println("Average = " + (double) sum / count);

	}

}
