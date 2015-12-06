import java.util.Scanner;

public class Problem_5 {

	public static void main(String[] args) {
		// Задача 5: Да се въведат от потребителя 2 числа. И да се
		// изведат на екрана всички числа от по-малкото до по-голямото.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number A:");
		int numA = sc.nextInt();
		System.out.println("Enter Number B:");
		int numB = sc.nextInt();

		if (numA <= numB) {
			for (int i = numA; i <= numB; i++) {
				System.out.println(i);
			}
		} else {
			for (int i = numB; i <= numA; i++) {
				System.out.println(i);
			}

		}
	}
}
