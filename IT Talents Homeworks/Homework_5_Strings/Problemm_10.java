import java.util.Scanner;

public class Problemm_10 {

	public static void main(String[] args) {
		// Задача 10:
		//
		// Да се състави програма, която по даден низ връща друг,
		// символите, на който са получени като към всеки код на символ
		// от ASCII таблицата е добавеното числото 5 и е записан
		// новополучения символ.
		// Пример :
		// Вход: Hello
		// Изход: Mjqqt

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter а string");
		String string1 = sc.nextLine();

		for (int i = 0; i < string1.length(); i++) {
			char current = string1.charAt(i);

			current += 5;
			System.out.print(current);

		}

	}

}
