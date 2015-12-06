import java.util.Scanner;

public class Problemm_22 {

	public static void main(String[] args) {
		// Задача 22:
		// Да се състави програма, която извежда първите 10 най-малки
		// числа, които се делят на 2, 3 или на 5 и които са по-големи от
		// въведено естествено число.
		// Числата се извеждат, заедно с техния пореден номер.
		// Входни данни: число от интервала [1..999]
		// Пример: 1
		// Изход: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14
		// Използвайте цикъл while.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number (1 to 999)");
		int numA = sc.nextInt();
		int count = 1;
		
		if ((numA >= 1)  &&(numA <= 999)) {
			numA++;
			
			while (count <= 10) {

				if ((numA % 2 == 0) || (numA % 3 == 0) || (numA % 5 == 0)) {
					System.out.print(count + ":" + numA + "; ");
					count++;
				}
				numA++;
			}

		} else{
			System.out.println("Not a vlid value");
		}
	}

}
