import java.util.Scanner;

public class Problemm_16 {

	public static void main(String[] args) {
		// Задача 16:
		// Въведено е трицифрено естествено число от вида abc.
		// Трябва да се провери дали:
		// ако a = b = c - Изход: цифрите са равни;
		// ако a>b>c - Изход: цифрите са във възходящ ред;
		// ако a<b<c цифрите са в низходящ ред;
		// и изход: цифрите са ненаредени, за неописаните случаи.
		// Да се състави програма, която извежда резултата от проверката за
		// наредба на цифрите в числото.
		// Пример: 345
		// Изход: възходящ ред.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 3-digit number");
		int num = sc.nextInt();
		if ((num >= 100) && (num <= 999)) {
			int thirdDig = num % 10;
			int secondDig = (num / 10) % 10;
			int firstDig = (num / 100) % 10;
			if ((firstDig > secondDig) && (secondDig > thirdDig)) {
				System.out.println("Низходящ ред");
			} else {
				if ((firstDig == secondDig) && (secondDig == thirdDig)) {
					System.out.println("цифрите са равни");
				} else {
					if ((firstDig < secondDig) && (secondDig < thirdDig)) {
						System.out.println("Възходящ ред");

					} else {
						System.out.println("Цифрите са ненаредени");
					}
				}
			}

		} else {
			System.out.println("The entered number is not in the specified range.");
		}

	}
}
