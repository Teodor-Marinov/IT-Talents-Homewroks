import java.util.Scanner;

public class Problem_9 {

	public static void main(String[] args) {
		// Задача 9:
		// Да се състави програма, чрез която по въведен низ съдържащ букви,
		// цифри, знак минус '-' се извежда сборът на въведените числа като се
		// отчита знакът '-' пред съответното число.
		// Вход: asd-12sdf45-56asdf100
		// Изход:
		// -12
		// 45
		// -56
		// 100
		// Сума = 77

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter а string");
		String string1 = sc.nextLine();
		int sum = 0;
		for (int i = 0; i < string1.length(); i++) {
			int number = 0;

			boolean isMinus = false;
			if ((string1.charAt(i) >= 48) && (string1.charAt(i) <= 57) && (i > 0)) {
				if (string1.charAt(i - 1) == '-') {
					isMinus = true;
				}
			}
			while ((i < string1.length()) && (string1.charAt(i) >= '0') && (string1.charAt(i) <= '9')) {
				number = number * 10 + ((string1.charAt(i)) - '0');
//				System.out.println(number);
				i++;
			}
			if (isMinus) {
				number = number * (-1);
			}
			if (number != 0) {
				System.out.println(number);
			}
			sum += number;
			
		}
		System.out.println("Sum = " + sum);

	}

}
