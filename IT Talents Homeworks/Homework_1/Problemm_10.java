import java.util.Scanner;

public class Problemm_10 {

	public static void main(String[] args) {
		// Задача 10:
		// Трябва да се напълни цистерна с вода. Имате 2 кофи с вместимост 2 и
		// 3 литра и ги ползвате едновременно.
		// Да се състави програма, която по даден обем извежда как ще прелеете
		// течността с тези кофи, т.е. по-колко пъти ще се пълни всяка от
		// кофите. Кофите не могат да се ползват с частично количество вода.
		// Входни данни: естествено число от интервала [10..9999].
		// Пример: 107
		// Изход: 21 пъти по 2 литра,
		// 21 пъти по 3 литра
		// допълнително кофа от 2 литра

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter required volume(10 - 9999litres)");
		int totalVol = sc.nextInt();
		int turnsNum = totalVol / 5;
		int leftVol = totalVol % 5;
		if (leftVol == 0) {
			System.out.println((turnsNum) + " x 2литра");
			System.out.println((turnsNum) + " x 3литра");
		} else {
			if (leftVol == 1) {
				System.out.println((turnsNum - 1) + " x 2литра");
				System.out.println((turnsNum+1) + " x 3литра");
			}
			if (leftVol == 2) {
				System.out.println((turnsNum + 1) + " x 2литра");
				System.out.println((turnsNum) + " x 3литра");
			}
			if (leftVol == 3) {
				System.out.println((turnsNum) + " x 2литра");
				System.out.println((turnsNum+1) + " x 3литра");
			}
			if (leftVol == 4) {
				System.out.println((turnsNum + 2) + " x 2литра");
				System.out.println((turnsNum) + " x 3литра");
			}
		}

	}

}

