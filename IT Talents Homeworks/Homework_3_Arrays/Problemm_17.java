import java.util.Scanner;

public class Problemm_17 {

	public static void main(String[] args) {
		// Задача 17:
		// Една редица от естествени числа ще наричаме зигзагообразна нагоре,
		// ако за елементите и са изпълняват условията:
		// N1 < N2 > N3 < N4 > N5 <..
		// Съставете програма, която проверява дали въведени в едномерен
		// масив редица от числа изпълняват горните изисквания.
		// Пример: 1 3 2 4 3 7
		// Изход: изпълнява изискванията за зигзагообразна нагоре редица

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		int numN = sc.nextInt();
		boolean flag = true;
		int arr[] = new int[numN];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element " + i);
			arr[i] = sc.nextInt();

		}
		for (int i = 1; i < arr.length-1; i+=2) {
			if (!((arr[i] > arr[i - 1]) && (arr[i] > arr[i + 1]))) {
				flag = false;
				break;

			}
		}

		if (flag == true) {
			System.out.println("Редицата E зигзагообразна нагоре.");

		} else {
			System.out.println("Редицата НЕ е зигзагообразна нагоре.");
		}
	}
}
