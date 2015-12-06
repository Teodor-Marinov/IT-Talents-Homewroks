import java.util.Scanner;

public class Problem_3 {

	public static void main(String[] args) {
		// Задача 3:
		// Въведете 2 различни числа от конзолата и разменете стойността им.
		// Разпечатайте новите стойности

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number A:");
		int numA = sc.nextInt();
		int numC = numA;
		System.out.println("Enter Number B differnet than A:");

		int numB = sc.nextInt();
		if (numA != numB) {

			numA = numB;
			numB = numC;
			System.out.println("Number A = " + numA);
			System.out.println("Number B = " + numB);
		} else {
			System.out.println("Number A is not different than number B");
		}

	}

}
