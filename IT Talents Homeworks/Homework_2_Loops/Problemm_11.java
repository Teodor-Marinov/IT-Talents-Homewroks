import java.util.Scanner;

public class Problemm_11 {

	public static void main(String[] args) {

		// Задача 11: Въведете число N чрез конзолата и изкарайте като
		// резултат следния триъгълник с височина N:
		// *
		// ***
		// *****
		// .................
		// Кaто допълнително упражнен

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number N:");
		int numN = sc.nextInt();

		for (int i = 0; i < numN; i++) {
			for (int j = i; j < numN; j++) {
				System.out.print(" ");
			}			
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

}
