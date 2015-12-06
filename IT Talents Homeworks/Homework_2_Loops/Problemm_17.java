import java.util.Scanner;

public class Problemm_17 {

	public static void main(String[] args) {
		// Задача 17:
		// Да се състави програма, която извежда квадрат, чийто страни са
		// оформени със знака *, а вътрешността е запълнена със въведен
		// знак.
		// Входни данни b - дължина на страната число от интервала
		// [3..20], c - желан знак.
		// Програмата да използва цикъл for.
		// Пример: 4 +
		// Изход:
		// ****
		// *++*
		// *++*
		// ****

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter side length(3 to 20)");
		short length = sc.nextShort();
		if ((length >= 3) && (length <= 20)) {
			System.out.println("Enter fill char");
			char x = sc.next().charAt(0);
			System.out.println(x);
			for (int i = 0; i < length; i++) {
				if ((i == 0) || (i == length - 1)) {
					for (int j = 0; j < length; j++) {
						System.out.print("* ");
					}
				} else {
					for (int j = 0; j < length; j++) {
						if ((j == 0) || (j == length - 1)) {
							System.out.print("* ");
						} else {
							System.out.print(x + " ");
						}
					}

				}
				System.out.println();

			}
		}

		else {
			System.out.println("Not a valid value");
		}
	}
}
