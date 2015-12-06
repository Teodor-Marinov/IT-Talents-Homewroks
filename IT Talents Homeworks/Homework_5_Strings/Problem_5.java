import java.util.Scanner;

public class Problem_5 {

	public static void main(String[] args) {
		// Задача 5:
		// Да се състави програма, чрез която се въвеждат 2 редици от знаци
		// (думи).
		// Ако в двете редици участва един и същи знак, да се изведе на екрана
		// първата редица хоризонтално, а втората вертикално, така че да се
		// пресичат в общия си знак.
		// Ако редиците нямат общ знак да се изведе само уведомително
		// съобщение.
		// Пример :
		// ма
		// шапка
		// ина

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String string1 = sc.nextLine();
		System.out.println("Enter Second string");
		String string2 = sc.nextLine();
		int index1 = 0;
		int index2 = 0;
		boolean isCommon = false;

		for (int i = 0; i < string1.length(); i++) {
			for (int j = 0; j < string2.length(); j++) {
				if (string1.charAt(i) == string2.charAt(j)) {
					index1 = i;
					index2 = j;
					isCommon = true;
					break;
				}
			}if(isCommon){
				break;
			}
		}
		if(isCommon){
		for (int i = 0; i < string2.length(); i++) {
			for (int j = 0; j < string1.length(); j++) {
				if (index2 == i) {
					System.out.print(string1.charAt(j));
				} else {
					if (index1 == j) {
						System.out.print(string2.charAt(i));
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		}else{
			System.out.print("No common char");
		}
	}

}
