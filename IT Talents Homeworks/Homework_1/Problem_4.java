import java.util.Scanner;

public class Problem_4 {

	public static void main(String[] args) {
		// Задача 4:
		// Въведете 2 различни числа от конзолата и ги разпечатайте в
		// нарастващ ред.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number A:");
		int numA = sc.nextInt();
		System.out.println("Enter Number B:");
		int numB = sc.nextInt();

		if (numA != numB) {
			if (numA < numB) {
				System.out.println(numA + " " + numB);
			} else {
				System.out.println(numB + " " + numA);
			}
		} else {
			System.out.println(numA + " " + numB);
		}

	}

}
