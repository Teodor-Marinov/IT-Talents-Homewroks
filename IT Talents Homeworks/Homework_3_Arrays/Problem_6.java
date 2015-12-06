import java.util.Scanner;

public class Problem_6 {

	public static void main(String[] args) {
		// Задача 6:
		// Напишете програма, която първо чете 2 масива и после извежда
		// съобщение дали са еднакви, и дали са с еднакъв размер.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of both arrays");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int arr1[] = new int[num1];
		int arr2[] = new int[num2];
		boolean flag = true;

		if (num1 != num2) {
			System.out.println("Масивите са с различен размер!");
		} else {

			for (int i = 0; i < arr1.length; i++) {

				System.out.println("For both arrays enter element " + i);
				arr1[i] = sc.nextInt();
				arr2[i] = sc.nextInt();
				if (arr1[i] != arr2[i]) {
					System.out.println("Двата масива не са еднакви!");
					flag = false;
					break;
				}

			}
			if (flag == true) {
				System.out.println("Двата масива са еднакви.");
			}

		}

	}
}
