import java.util.Scanner;

public class Problem_2 {

	public static void main(String[] args) {

		// Задача 2:
		// Имате квадратен двумерен масив от естествени числа, чийто стойности
		// се въвеждат. Да се отпечатат диагоналите на масива.
		// Пример:
		// 1,4,6,3
		// 5,9,7,2
		// 4,8,1,9
		// 2,3,4,5
		// Изход:
		// 1 9 1 5
		// 3 7 8 2

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int numN = sc.nextInt();

		int arr[][] = new int[numN][numN];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				System.out.println("Enter element " + i + " " + j);
				arr[i][j] = sc.nextInt();
			}

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.print("Главен диагонал: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][i]+", ");
		}
		System.out.println();
		System.out.print("Втори диагонал: ");
		for (int i = 0; i <arr.length; i++) {
			System.out.print(arr[i][numN-i-1]+", ");
		}
	}

}
