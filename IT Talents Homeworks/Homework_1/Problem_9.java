import java.util.Scanner;

public class Problem_9 {

	public static void main(String[] args) {
		// Задача 9:
		// Да се състави програма, която чете от конзолата 2 естествени
		// двуцифрени числа a,b.
		// Програмата да изведе в конзолата дали последната цифра от
		// произведението на двете числа е четна, както и самата цифра.
		// Входни данни: a,b - естествени числа от интервала [10..99].
		// Пример: 15, 25
		// Изход: 375, 5 нечетна

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number A:");
		int numA = sc.nextInt();
		System.out.println("Enter Number B:");
		int numB = sc.nextInt();
		if (((numA >= 10) && (numA <= 99)) && ((numB >= 10) && (numB <= 99))) {
			int lastDigit = (numA * numB) % 10;
			if (lastDigit % 2 == 0) {
				System.out.println(numA * numB + ", Even last digit: " + lastDigit);
			} else {
				System.out.println(numA * numB + ", Odd last digit: " + lastDigit);
			}
		} else {
			System.out.println("An enetered number is not within the specified range");
		}
	}

}
