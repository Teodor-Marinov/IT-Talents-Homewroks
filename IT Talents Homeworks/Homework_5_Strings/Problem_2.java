import java.util.Scanner;

public class Problem_2 {

	public static void main(String[] args) {
		// Да се състави програма, чрез която от клавиатурата се въвеждат
		// последователно две думи с дължина 10-20 знака.
		// Програмата да размени първите им 5 знака и да изведе дължината на
		// по-дългата, както и новото им съдържание.
		// Пример: uchilishe uchenik
		// Изход: 9 uchenishe

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first word");
		String string1 = sc.nextLine();
		System.out.println("Enter second word");
		String string2 = sc.nextLine();
		if ((string1.length() <= 20) && (string2.length() <= 20) && (string1.length() >= 10)
				&& (string2.length() >= 10)) {
			String str1Beginning = string1.substring(0, 5);
			String str1End = string1.substring(5, string1.length());
			String str2Beginning = string2.substring(0, 5);
			String str2End = string2.substring(5, string2.length());
			String str1New = str2Beginning + str1End;
			String str2New = str1Beginning + str2End;

			if (str1New.length() >= str2New.length()) {
				System.out.println("Дължината на по-дългият стринг е " + str1New.length() + " символа: " + str1New);
			} else {
				System.out.println("Дължината на по-дългият стринг е " + str2New.length() + " символа: " + str2New);
			}
			System.out.println("Двата нови стринга са: " + str1New + "; " + str2New);

		} else {
			System.out.println("Invalid length of strings");
		}
	}

}
