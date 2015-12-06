import java.util.Scanner;

public class Problem_7 {

	public static void main(String[] args) {
		// Задача 7:
		// Въведете 3 променливи от клавиатурата – час (целочислен тип), сума
		// пари (число с плаваща запетая), дали съм здрав – булев тип.
		// Съставете програма, която взема решения на базата на тези данни по
		// следния начин:
		// - ако съм болен, няма да излизам
		// - ако имам пари, ще си купя лекарства
		// - ако нямам – ще стоя вкъщи и ще пия чай
		// - ако съм здрав, ще отида на кино с приятели
		// - ако имам по-малко от 10 лв, ще отида на кафе.
		// Полученото решение покажете като съобщение в конзолата.

		Scanner sc = new Scanner(System.in);
//		излишна променлива
//		System.out.println("Enter day hour:");
//		int hour = sc.nextInt();
		
		System.out.println("Enter money amount:");
		double amount = sc.nextDouble();
		System.out.println("Am I sick");
		boolean isSick = sc.nextBoolean();
		if (isSick == true) {
			if (amount > 0) {
				System.out.println("Ще си купя лекарства");
			} else {
				System.out.println("Ще стоя вкъщи и ще пия чай");
			}
		} else {
			if (amount > 10) {
				System.out.println("Ще отида на кино с приятели");
			} else {
				System.out.println("Ще отида на кафе");
			}
		}
	}

}
