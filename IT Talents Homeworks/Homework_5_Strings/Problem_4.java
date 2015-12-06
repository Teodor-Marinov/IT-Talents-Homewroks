import java.util.Arrays;
import java.util.Scanner;

public class Problem_4 {

	public static void main(String[] args) {
		// Задача 4:
		// Да се състави програма, чрез която по въведени трите имена на двама
		// човека разделени със запетая, се извежда чие име има по-голям сбор
		// от ASCII кодовете на съставящите името букви.
		// Пример: Anna Dosewa Asenowa, Iwo Peew Peew
		// Изход: Anna Dosewa Asenowa
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter names, separated by comma, of two people");
		String string1 = sc.nextLine();
		String[] names = string1.split(",");
		if (names.length != 2) {
			System.out.println("Entered names do not meet criteria");
		} else {
			names[0]=names[0].trim();
			names[1]=names[1].trim();
//			System.out.println(Arrays.toString(names));
			int sum1 = 0;
			int sum2 = 0;
			for (int i = 0; i < names[0].length(); i++) {
				sum1 += names[0].charAt(i);
			}
			for (int i = 0; i < names[1].length(); i++) {
				sum2 += names[1].charAt(i);
			}
//			System.out.println(sum1 + " " + sum2);		
			if (sum1 >= sum2) {
				System.out.println(names[0]);
			} else {
				System.out.println(names[1]);
			} 
		}

	}
}