import java.util.Scanner;

public class Problemm_10 {

	public static void main(String[] args) {
		// Задача 10: Въведете число от клавиатурата и определете дали е
		// просто. Просто число е това което се дели САМО на 1 и на себе
		// си.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number A:");
		int numA = sc.nextInt();
		boolean isPrime = true;

		for (int i = 2; i < numA - 1; i++) {
			if (numA % i == 0) {
				isPrime = false;
				System.out.println("Not a prime number");
				break;
			}

		}
		if (isPrime) {
			System.out.println("Prime number");
		}
	}
}
