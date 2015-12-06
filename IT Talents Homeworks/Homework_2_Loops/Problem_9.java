import java.util.Scanner;

public class Problem_9 {

	public static void main(String[] args) {
		// Задача 9: Да се прочетат 2 числа от клавиатурата А и В.
		// Да се изведат всички числа от А до В на степен 2(разделени с
		// запетая).Ако някое число е кратно на 3, да се изведе съобщение че
		// числото се пропуска „skip 3“.Ако сумата от всички изведени числа (без
		// пропуснатите) стане по-голяма от 200, да се прекрати извеждането.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number A:");
		int numA = sc.nextInt();
		System.out.println("Enter Number B:");
		int numB = sc.nextInt();
		int sum = 0;
		if (numA <= numB) {

			for (int j = numA; j <= numB; j++) {
				if ((j * j) % 3 == 0) {
					System.out.print("skip " + j*j + ", ");
				} else {
					System.out.print(j * j + ", ");
					sum = sum + (j * j);
				}
				if (sum > 200) {
					break;
				}

			}
		} else {
			for (int j = numB; j <= numA; j++) {
				if ((j * j) % 3 == 0) {
					System.out.print("skip " + j*j + ", ");
				} else {
					System.out.print(j * j + ", ");
					sum = sum + (j * j);
				}
				if (sum > 200) {
					break;
				}

			}
		}

	}

}
