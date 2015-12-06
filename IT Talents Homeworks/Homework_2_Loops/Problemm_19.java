import java.util.Scanner;

public class Problemm_19 {

	public static void main(String[] args) {
		// Задача 19: Да се състави програма, чрез която по въведено
		// естествено число от интервала [10..99] се извежда поредица
		// числа, при спазване на следните изисквания:
		// 1) ако предходното число е четно се извежда 0.5*числото;
		// 2) ако предходното число е нечетно се извежда 3*числото +1.
		// Извеждането продължава докато не се получи стойност 1.
		// Пример: 11
		// Изход: 34 17 52 26 13 40 20 10 5 16 8 4 2 1.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number (10 to 99)");
		int numA = sc.nextInt();
		if ((numA >= 10) && (numA <= 99)) {
			while (numA > 1) {
				if (numA % 2 == 0) {
					numA = numA / 2;
					System.out.print(numA + ", ");
				} else {
					numA = 3 * numA + 1;
					System.out.print(numA + ", ");
				}

			}
		}else{
			System.out.println("Not a vlid value");
		}

	}

}
