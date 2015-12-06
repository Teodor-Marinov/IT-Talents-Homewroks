import java.util.Scanner;

public class Problemm_11 {

	public static void main(String[] args) {
		// Çàäà÷à 11:
		// Ñúñòàâåòå ïğîãğàìà, êîÿòî ïî äàäåíî òğèöèôğåío ÷èñëî ïğîâåğÿâà
		// äàëè ÷èñëîòî ñå äåëè íà âñÿêà ñâîÿ öèôğà. Âúâ âúâåäåíîòî ÷èñëî äà
		// íÿìà öèôğà 0.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 3-digit number");
		int num = sc.nextInt();
		if ((num >= 100) && (num <= 999)) {
			int thirdDig = num % 10;
			int secondDig = (num / 10) % 10;
			int firstDig = (num / 100) % 10;
			if ((thirdDig == 0) || (secondDig == 0)) {
				System.out.println("The entered number contains the 0 digit!");
			} else {
				if ((num % firstDig == 0) && (num % secondDig == 0) && (num % thirdDig == 0)) {
					System.out.println("Âúâåäåíîòî ÷èñëî ñå äåëè íà âñÿêà ñâîÿ öèôğà");
				} else {
					System.out.println("Âúâåäåíîòî ÷èñëî íå ñå äåëè íà âñÿêà ñâîÿ öèôğà");
				}
			}
		} else {
			System.out.println("The entered number is not in the specified range.");
		}

	}

}
