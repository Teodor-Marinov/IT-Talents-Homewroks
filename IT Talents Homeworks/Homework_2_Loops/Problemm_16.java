import java.util.Scanner;

public class Problemm_16 {

	public static void main(String[] args) {
		// Задача 16:
		// Да се състави програма, чрез която се въвеждат 2 естествени
		// числа N, M от интервала [10..5555].
		// Програмата, чрез цикъл for, да извежда всички числа от
		// интервала, които са кратни на 50 в низходящ ред.
		// Пример: 25,249
		// Изход: 200,150,100, 50.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number A(10 to 5555)");
		int numA = sc.nextInt();
		System.out.println("Enter number B(10 to 5555)");
		int numB = sc.nextInt();
		if (numA <= numB) {
			for (int i = numB; i >= numA; i--) {
				if (i % 50 == 0) {
					System.out.print(i + ", ");
				}

			}
		} else {
			for (int i = numA; i >= numB; i--) {
				if (i % 50 == 0) {
					System.out.print(i + ", ");
				}

			}
		}

	}

}
