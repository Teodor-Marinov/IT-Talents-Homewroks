import java.util.Scanner;

public class Problemm_12 {

	public static void main(String[] args) {
		// Задача 12: Да се състави програма, която извежда всички
		// естествени трицифрени числа, които нямат еднакви цифри т.е.
		// 100,101, 606 и т.н. не се извеждат.

		
				for (int i = 100; i < 999; i++) {

			int thirdDig = i % 10;
			int secondDig = (i / 10) % 10;
			int firstDig = (i / 100) % 10;
			if(!((firstDig==secondDig)||(firstDig==thirdDig)||(secondDig==thirdDig))){
				System.out.print(i+" ");
			}
		}

	}

}
