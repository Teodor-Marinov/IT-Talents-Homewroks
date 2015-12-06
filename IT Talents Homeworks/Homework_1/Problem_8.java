import java.util.Scanner;

public class Problem_8 {

	public static void main(String[] args) {
		// Задача 8:
		// Да се състави програма, която чете от конзолата 4-цифренo
		// естествено число от интервала [1000.. 9999]. От това число се
		// формират 2 нови 2-цифрени числа. Първото число се формира от 1-та
		// и 4-та цифра на въведеното число. Второто число се формира от 2-рa -
		// 3-та цифра на въведеното число. Като резултат да се изведе дали 1-то
		// ново число e по-малко <, равно = или по-голямо от 2-то число.
		// Пример: 3332 Изход: по-малко (32<33)
		// Пример: 1144 Изход: равни (14=14)
		// Пример: 9875 Изход: по-голямо (95>87)

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 4-digit Number");
		int num = sc.nextInt();
		if ((num >= 1000) && (num <= 9999)) {
			int fourthDig = num % 10;
			int thirdDig = (num / 10) % 10;
			int secondDig = (num / 100) % 10;
			int firstDig = (num / 1000) % 10;
			int newNum1 = firstDig * 10 + fourthDig;
			int newNum2 = secondDig * 10 + thirdDig;
	
			if (newNum1 == newNum2) {
				System.out.println("The new numbers are equal(" + newNum1 + " = " + newNum2 + ")");
			} else {
				if (newNum1 < newNum2) {
					System.out.println("Lesser(" + newNum1 + " < " + newNum2 + ")");
				} else {
					System.out.println("Higher(" + newNum1 + " > " + newNum2 + ")");
				}
			}
		} else {
			System.out.println("The entered number is not in the specified range.");
		}

	}

}
