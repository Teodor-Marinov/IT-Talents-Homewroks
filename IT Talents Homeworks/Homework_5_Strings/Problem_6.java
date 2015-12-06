import java.util.Arrays;
import java.util.Scanner;

public class Problem_6 {

	public static void main(String[] args) {
		// Задача 6:
		// Да се състави програма, чрез която се въвежда изречение с отделни
		// думи.
		// Като резултат на екрана да се извежда същия текст, но всяка отделна
		// дума да започва с главна буква, а следващите я букви да са малки.
		// Пример: супер яката задача
		// Изход: Супер Яката Задача

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String string1 = sc.nextLine();
		string1 = string1.toLowerCase();
		String[] words = string1.split(" ");
		for (int i = 0; i < words.length; i++) {
			String first = words[i].substring(0, 1);
			first = first.toUpperCase();
			String end = words[i].substring(1, words[i].length());
			words[i] = first + end;
			System.out.print(words[i] + " ");
		}

	}

}
