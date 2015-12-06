import java.util.Scanner;

public class Problemm_21 {

	public static void main(String[] args) {
		// Задача 21:
		// Дадено е наредено тесте карти.
		// Наредбата по тежест на карта е: 2,3,4,5,6,7,8,9,10, Вале, Дама,
		// Поп, Асо.
		// Наредбата по цвят на картите е: спатия, каро, купа, пика.
		// Да се създаде програма, чрез която се въвежда N - число от
		// интервала [1..51] и се извеждат въведения номер карта и
		// останалите по-големи карти от тестето.
		// Пример: 47.
		// Изход: Поп купа, Поп пика, Асо спатия, Асо каро, Асо купа, Асо
		// пика

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter card number");
		int card = sc.nextInt();

		for (int i = card; i <= 52; i++) {
			if (i % 4 != 0) {
				switch (i / 4) {
				case 0:
					System.out.print("двойка");
					break;
				case 1:
					System.out.print("тройка");
					break;

				case 2:
					System.out.print("четворка");
					break;

				case 3:
					System.out.print("петица");
					break;

				case 4:
					System.out.print("шестица");
					break;

				case 5:
					System.out.print("седмица");
					break;
				case 6:
					System.out.print("осмица");
					break;
				case 7:
					System.out.print("девятка");
					break;
				case 8:
					System.out.print("десятка");
					break;
				case 9:
					System.out.print("вале");
					break;
				case 10:
					System.out.print("дама");
					break;
				case 11:
					System.out.print("поп");
					break;
				case 12:
					System.out.print("асо");
				}
			} else {
				switch (i / 4) {
				case 13:
					System.out.print("асо");
					break;
				case 2:
					System.out.print("тройка");
					break;

				case 3:
					System.out.print("четворка");
					break;

				case 4:
					System.out.print("петица");
					break;

				case 5:
					System.out.print("шестица");
					break;

				case 6:
					System.out.print("седмица");
					break;
				case 7:
					System.out.print("осмица");
					break;
				case 8:
					System.out.print("девятка");
					break;
				case 9:
					System.out.print("десятка");
					break;
				case 10:
					System.out.print("вале");
					break;
				case 11:
					System.out.print("дама");
					break;
				case 12:
					System.out.print("поп");
					break;
				case 1:
					System.out.print("двойка");
				}

			}

			switch (i % 4) {
			case 0:
				System.out.print(" пика; ");
				break;
			case 1:
				System.out.print(" спатия; ");
				break;
			case 2:
				System.out.print(" каро; ");
				break;
			case 3:
				System.out.print(" купа; ");

			}

		}
	}
}
