import java.util.Scanner;

public class Problemm_15 {

	public static void main(String[] args) {
		// Задача 15:
		// Да се състави програма, която въвежда естествено число от интервала
		// [0..24].
		// Програмата да изведе съответстващо съобщение съобразно въведения
		// час.
		// Периодите са:
		// [18..4] - Добър вечер;
		// [4..9] - Добро утро;
		// [9..18] - Добър ден
		// Пример: 10
		// Изход: Добър ден

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day hour(0 to 24)");
		int hour = sc.nextInt();
		if ((hour > 24) || (hour < 0)) {
			System.out.println("not a valid value");
		} else {
			if (((hour > 4) && (hour <= 9))) {
				System.out.println("Добро утро!");

			} else {
				if (((hour > 9) && (hour <= 18))) {
					System.out.println("Добър ден!");
				} else {
					System.out.println("Добър вечер!");
				}
			}
		}
	}

}