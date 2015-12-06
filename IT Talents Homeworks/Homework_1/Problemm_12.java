import java.util.Scanner;

public class Problemm_12 {

	public static void main(String[] args) {
		// Задача 12
		//
		// Високосни години са всички години кратни на 4 с изключения
		// столетията, но без столетия кратни на 400, т.е. 1900 не е високосна,
		// но 1600 и 2000 са високосни.
		// Съставете програма, която по дадени ден, месец, година отпечатва
		// следващата дата.
		// Входни данни: три числа за ден, месец, година.
		// Пример: 28, 2, 2000
		// Изход: 1,3,2000

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		int day = 0;
		int year = sc.nextInt();
		boolean isYear = false;
		if (((year % 4 == 0) & !(year % 100 == 0)) || (year % 400 == 0)) {
			System.out.println("Високосна година");
			isYear = true;
		}
		System.out.println("Enter a month");
		int month = sc.nextInt();
		if ((month < 1) || (month > 12)) {
			System.out.println("Not a valid month");
		} else {
			System.out.println("Enter a day");
			day = sc.nextInt();
			if ((day > 0)) {
				switch (month) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10: {
					if ((day > 0) && (day < 31)) {
						day++;
						System.out.println("next date: " + day + " " + month + " " + year);
					}
					if (day == 31) {
						day = 1;
						month++;
						System.out.println("next date: " + day + " " + month + " " + year);
					} else {
						System.out.println("Not a valid day");
					}
					break;
				}
				case 4:
				case 6:
				case 9:
				case 11: {
					if ((day > 0) && (day < 30)) {
						day++;
						System.out.println("next date: " + day + " " + month + " " + year);
					}
					if (day == 30) {
						day = 1;
						month++;
						System.out.println("next date: " + day + " " + month + " " + year);
					} else {
						System.out.println("Not a valid day");
						break;
					}
				}
				case 2: {
					if ((day > 0) && (day < 28)) {
						day++;
						System.out.println("next date: " + day + " " + month + " " + year);
					}
					if (((day == 28) && (isYear == false)) || ((day == 29) && (isYear == true))) {
						day = 1;
						month++;
						System.out.println("next date: " + day + " " + month + " " + year);
					} else {
						if ((day == 28) && (isYear == true)) {
							day++;
							System.out.println("next date: " + day + " " + month + " " + year);
						} else {
							System.out.println("Not a valid day");
							break;
						}

					}
				}
				case 12: {
					if ((day > 0) && (day < 31)) {
						day++;
						System.out.println("next date: " + day + " " + month + " " + year);
					}
					if (day == 31) {
						day = 1;
						month = 1;
						year++;
						System.out.println("next date: " + day + " " + month + " " + year);
					} else {
						System.out.println("Not a valid day");
						break;
					}
				}
				default:
					System.out.println("Not a valid day");
					break;
				}
			}

		}

	}
}
