import java.util.Scanner;

public class Problemm_13 {

	public static void main(String[] args) {
		// Задача 13:
		// Да се състави програма, която да отгатне колко е студено/топло по
		// въведената температура t в градус Целзий.
		// Температурните интервали са:
		// под -20 ледено студено;
		// между 0 и -20 - студено;
		// между 15 и 0 - хладно;
		// между 25 и 15 - топло;
		// над 25 – горещо.
		// Входни данни: цяло число от интервала [-100..100].
		// Пример: 12
		// Изход: хладно

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature value(-100 to 100C)");
		int temp = sc.nextInt();
		if ((temp > 100) || (temp < -100)) {
			System.out.println("not a valid value");
		} else {
			if (temp <= -20) {
				System.out.println("ледено студено");

			}
			if (((temp > -20) && (temp <= 0))) {
				System.out.println("студено");

			}
			if (((temp > 0) && (temp <= 15))) {
				System.out.println("хладно");

			}
			if (((temp > 15) && (temp <= 25))) {
				System.out.println("топло");

			}

			if (temp > 25) {
				System.out.println("горещо");

			}
		}
	}

}
